package com.dailycodebuff.springboottutorial.service;

import java.util.List;

import com.dailycodebuff.springboottutorial.entities.Department;
import com.dailycodebuff.springboottutorial.error.DepartmentNotFoundException;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartment();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDeppartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);

    
    
}
