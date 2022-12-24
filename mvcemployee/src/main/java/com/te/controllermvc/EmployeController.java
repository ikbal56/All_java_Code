package com.te.controllermvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.dtomvc.Employe;
import com.te.servicemvc.EmployeService;

@Controller
public class EmployeController {

	@Autowired
	private EmployeService service;

	@GetMapping("/signup")
	public String signupEmployee() {

		return "signup";

	}

	@GetMapping("/add")
	public String addDetails(Employe emp, ModelMap map) {

		if (service.addEmploye(emp)) {

			map.addAttribute("msg", "Successfully Registered");
			map.addAttribute("Empp", emp);

		} else {

			map.addAttribute("msg", "Failed to Registered");

		}

		return "confirmation";

	}
	

	@GetMapping("/findEmp")
	public String getEmployee() {

		return "find";
	}

	@PostMapping("/searchEmp")
	public String getEmployee(int empId, String password, ModelMap map) {
		Employe emp = service.getEmployee(empId, password);
		if (emp != null) {
			map.addAttribute("employee", emp);
			map.addAttribute("msg", "sucessfully find the employee");
		} else {
			map.addAttribute("msg", "No such employee found");

		}
		return "details";
	}
	
	@GetMapping("/delete")
	public String deleteemp() {
		return "deleteEmp";
	}
	
	@PostMapping("/deleteEmp")
	public String deleteEmp(int empId, String password, ModelMap map) {
		if (service.deleteEmp(empId, password)) {
			map.addAttribute("msg", "Sucessfully deleted the employee details");
		} else {
			map.addAttribute("msg", "No such employee found");
		}
		return "deleteCon";

	}
	

	@GetMapping("/updateEmp")
	public String update() {
		return "update";
	}
	

	@PostMapping("/update")
	public String updateEmp(Employe emp, ModelMap map) {
		if (service.updateEmp(emp)) {
			map.addAttribute("msg", "Sucessfully updated");
		} else {
			map.addAttribute("msg", "Failed to updated the details");
		}
		return "updateCon";

	}
	
}
