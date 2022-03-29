package com.cg.healthcare;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cg.healthcare.dao.IAdminRepository;
import com.cg.healthcare.entities.User;
import com.cg.healthcare.service.IAdminServiceImpl;
import com.cg.healthcare.service.IUserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AdminTest {

	@Autowired
	private MockMvc mockmvc;

	@Autowired
	private WebApplicationContext context;

	ObjectMapper om = new ObjectMapper();

	@MockBean
	IAdminRepository adminrepo;
	@Autowired
	IUserServiceImpl userservice;
	@Autowired
	IAdminServiceImpl adminservice;

	@Before
	public void setUp() {
		mockmvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void addAdmin() throws Exception {
		User user = new User("newadmin1", "123456", "");
		String jsonReq = om.writeValueAsString(user);
		MvcResult result = mockmvc
				.perform(post("/admin/registerAdmin").content(jsonReq).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		HttpStatus httpStatus = om.readValue(resultContent, HttpStatus.class); // HttpStatus because in our controller
																				// we are returning HttpStatus
		assertTrue(httpStatus.is2xxSuccessful());

	}

	@Test
	public void getAdmin() throws Exception {

		when(adminrepo.findAll())
				.thenReturn(Stream.of(new User("admin1", "pass", "admin"), new User("admin2", "pass", "admin"))
						.collect(Collectors.toList()));
		assertEquals(2, userservice.getAll().size());

	}

	@Test
	public void deleteAdmin() throws Exception {

		User user = new User("user1", "pass", "");
		when(adminrepo.save(user)).thenReturn(user);
		adminrepo.delete(user);
		assertThat(user.getUsername().isEmpty());

	}
	/*
	 * @Autowired private IAdminRepository repo;
	 */

	/*
	 * @BeforeEach public void setUp() throws Exception { super.setUp(); }
	 */

	/*
	 * @Test public void regAdmin() throws Exception { String uri =
	 * "/admin/registeradmin"; User user = new User("Vivek","Sankhla",""); String
	 * inputJson = super.mapToJson(user); MvcResult mvcResult = mvc.perform(
	 * MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE
	 * ).content(inputJson)) .andReturn(); assertEquals(200,
	 * mvcResult.getResponse().getStatus()); }
	 * 
	 * 
	 * @Test public void delAdmin() throws Exception { String uri =
	 * "/admin/deleteAdmin/6";
	 * 
	 * MvcResult mvcResult = mvc.perform( MockMvcRequestBuilders.delete(uri))
	 * .andReturn(); assertEquals(200, mvcResult.getResponse().getStatus()); }
	 */

}
