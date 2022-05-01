package com.dailycodebuff.springboottutorial.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.dailycodebuff.springboottutorial.dao.DepartmentRepo;
import com.dailycodebuff.springboottutorial.entities.Department;
import com.dailycodebuff.springboottutorial.error.DepartmentNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{


    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Department saveDepartment(Department department) {
        
        return departmentRepo.save(department);
    }
    @Override
    public List<Department> fetchDepartment() {
        
        return departmentRepo.findAll();
    }
    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        
        Optional<Department> department = departmentRepo.findById(departmentId);

        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department not available.");
        }
        return department.get();
    }

    @Override
    public void deleteDeppartmentById(Long departmentId) {
        departmentRepo.deleteById(departmentId);
        
    }
    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {

        //Checking Not Null and not empty
        Department departDB= departmentRepo.findById(departmentId).get();
        
        if(Objects.nonNull(department.getDepartmentName()) &&
        !"".equalsIgnoreCase(department.getDepartmentName())){
            departDB.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) &&
        !"".equalsIgnoreCase(department.getDepartmentAddress())){
            departDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        if(Objects.nonNull(department.getDepartmentCode()) &&
        !"".equalsIgnoreCase(department.getDepartmentCode())){
            departDB.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepo.save(departDB);
    }
    @Override
    public Department fetchDepartmentByName(String departmentName) {
        
        return  departmentRepo.findAllByDepartmentNameIgnoreCase(departmentName);
    }
    
    
}
