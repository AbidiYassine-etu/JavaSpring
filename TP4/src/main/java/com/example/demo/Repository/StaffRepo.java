package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Staff;

public interface StaffRepo extends JpaRepository<Staff,Integer>{

}
