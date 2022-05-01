package com.dailycodebuff.springboottutorial.controller;

import java.util.List;

import javax.validation.Valid;

import com.dailycodebuff.springboottutorial.entities.Department;
import com.dailycodebuff.springboottutorial.error.DepartmentNotFoundException;
import com.dailycodebuff.springboottutorial.service.DepartmentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "/department")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping(value = "/department")
    public List<Department> fetchDepartment(){
        return departmentService.fetchDepartment();
    }

    @GetMapping(value = "/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException{
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping(value = "/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDeppartmentById(departmentId);
        return "Deleted";
    }

    @PutMapping(value = "/department/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId,
                                             @RequestBody Department department){
    return departmentService.updateDepartmentById(departmentId, department);

    }

    @GetMapping(value = "/department/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return  departmentService.fetchDepartmentByName(departmentName);
    }

}
