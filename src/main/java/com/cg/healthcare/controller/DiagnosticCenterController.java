package com.cg.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.healthcare.entities.Appointment;
import com.cg.healthcare.entities.DiagnosticCenter;
import com.cg.healthcare.entities.DiagnosticTest;
import com.cg.healthcare.exception.DataNotFoundInDataBase;
import com.cg.healthcare.exception.DiagnosticCenterNotFoundException;
import com.cg.healthcare.exception.ForBiddenException;
import com.cg.healthcare.loginmodule.LoginService;
import com.cg.healthcare.service.IDiagnosticCenterService;

@Controller
@ResponseBody
@RequestMapping("/DiagnosticCenter")
public class DiagnosticCenterController {

	@Autowired
	IDiagnosticCenterService diagnostic_repo;

	@Autowired
	LoginService logServ;

	// 1
	@GetMapping("/getDiagnosticCenters")
	public List<DiagnosticCenter> getAllDiagnosticCenters() throws ForBiddenException {
		return diagnostic_repo.getAllDiagnosticCenters();

	}

	@PostMapping("/addDiagnosticCenter")
	public DiagnosticCenter addDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) throws Exception {
		return diagnostic_repo.addDiagnosticCenter(diagnosticCenter);
	}

	@GetMapping("/getDiagnosticCenterbyId/{diagnosticCenterId}")
	public DiagnosticCenter getDiagnosticCenterById(@PathVariable int diagnosticCenterId)
			throws DiagnosticCenterNotFoundException, DataNotFoundInDataBase, ForBiddenException {
		return diagnostic_repo.getDiagnosticCenterById(diagnosticCenterId);
	}

	@PutMapping("/updateDiagnosticCenter")
	public DiagnosticCenter updateDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter)
			throws DataNotFoundInDataBase, ForBiddenException {
		return diagnostic_repo.updateDiagnosticCenter(diagnosticCenter);

	}

	@GetMapping("/viewTestDetail/{diagnosticCenterId}")
	public List<DiagnosticTest> viewTestDetails(@PathVariable int diagnosticCenterId) throws ForBiddenException {
		return diagnostic_repo.viewTestDetails(diagnosticCenterId);
	};

	@PostMapping("/addTest/{diagnosticcenterId}/{testid}")
	public DiagnosticTest addTest(@PathVariable int diagnosticCenterId, @PathVariable int testid)
			throws DataNotFoundInDataBase, ForBiddenException {
		return diagnostic_repo.addTest(diagnosticCenterId, testid);
	}

	@GetMapping("/getDiagnosticCenter/{centername}") // http://localhost:9091/DiagnosticeCenter/getDiagnosticCenter/?centername=
	public DiagnosticCenter getDiagnosticCenter(@PathVariable String centername) 
			throws DataNotFoundInDataBase, ForBiddenException {
		return diagnostic_repo.getDiagnosticCenter(centername);
	}

	@DeleteMapping("/removeDiagnosticCenter/{id}")
	public DiagnosticCenter removeDiagnosticCenter(@PathVariable int id)
			throws DiagnosticCenterNotFoundException, ForBiddenException {
		return diagnostic_repo.removeDiagnosticCenter(id);
	}

	@GetMapping("/appointments/{centerName}")
	public List<Appointment> getListOfAppointments(@PathVariable String centerName) throws ForBiddenException {
		return diagnostic_repo.getListOfAppointments(centerName);

	}

}
