package com.cg.healthcare;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.healthcare.dao.IUserRepository;
import com.cg.healthcare.entities.User;
import com.cg.healthcare.service.IUserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

	@MockBean
	IUserRepository repo;

	@Autowired
	IUserServiceImpl userservice;

	@Test
	public void getUserTest() throws Exception {

		when(repo.findAll()).thenReturn(
				Stream.of(new User("user1", "pass", ""), new User("user2", "pass", "")).collect(Collectors.toList()));
		assertEquals(2, userservice.getAll().size());
	}

	@Test
	public void adduserTest() throws Exception {
		User user = new User("user1", "pass", "");
		when(repo.save(user)).thenReturn(user);
		repo.save(user);
		assertThat(user.getUsername()).isSameAs("user1");
	}

	@Test
	public void deleteuserTest() throws Exception {
		User user = new User("user1", "pass", "");
		when(repo.save(user)).thenReturn(user);
		repo.delete(user);
		assertThat(user.getUsername().isEmpty());
	}
}
