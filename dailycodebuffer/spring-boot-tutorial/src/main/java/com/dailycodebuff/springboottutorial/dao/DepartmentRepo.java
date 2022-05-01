package com.dailycodebuff.springboottutorial.dao;



import com.dailycodebuff.springboottutorial.entities.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

  
  public Department findAllByDepartmentNameIgnoreCase(String departmentName);
}
