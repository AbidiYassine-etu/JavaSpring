package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Staff;
import com.example.demo.Service.StaffServices;


@RestController
public class StaffController {
	
	@Autowired
	StaffServices staffService;
	
	 @GetMapping("/")
	 public String getAllStaffs(Model model) {
		 List<Staff> staffList = staffService.getAll();
		 if(staffList.size() >0) {
			 model.addAttribute("staffs",staffList);
		 }
		 return "list-staffs";
	 }
	 
	 
	 @GetMapping("/add-staff")
	 public String addStaff(Model model) {
		 model.addAttribute("staff",new Staff());
		 return "add-edit-staff";
	 }
	 
	 @PostMapping("/save-staff")
	 public String saveStaff(Staff staff) {
		 staffService.save(staff);
		 return "redirect:/";
	 }
	 
	 @GetMapping("/staff-update/{id}")
	 public String getStaff(Model model, @PathVariable("id") Integer id) {
		 Staff staff = staffService.getById(id);
		 model.addAttribute("staff",staff);
		 return "add-edit-staff";
	 }
	 
	 @GetMapping("/staff-delete/{id}")
	 public String deleteStaff(@PathVariable("id") Integer id) {
		 Staff deleteStaff = staffService.getById(id);
		 staffService.delete(deleteStaff);
		 return "redirect:/";
		 }
}
