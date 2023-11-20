package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Staff;

public interface StaffServices {
	void save (Staff staff);
	List<Staff> getAll();
	Staff getById(Integer id);
	void delete(Staff staff);
	
}
