package com.dailycodebuff.springboottutorial.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.dailycodebuff.springboottutorial.dao.DepartmentRepo;
import com.dailycodebuff.springboottutorial.entities.Department;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepo departmentRepo;

    @BeforeEach
    void setUp(){

    }

    @Test
    @DisplayName("Get Data Based on Valid Department Name")
    public void whenValidDeparmentName_thenDepartmentShouldBeFound(){
        String departmentName ="IT";
        Department found= departmentService
        .fetchDepartmentByName(departmentName);
assertEquals(departmentName, found.getDepartmentName());

    }
}
