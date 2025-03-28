package com.microservices_with_sb.microservice_with_sb_department_service.controller;

import com.microservices_with_sb.microservice_with_sb_department_service.model.Department;
import com.microservices_with_sb.microservice_with_sb_department_service.repository.DepartmentInMemoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public Department addDepartment(@RequestBody Department department){
        log.info("Adding department");
        return departmentService.addDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments(){
        log.info("Get all department");
        return departmentService.getAllDepartments();
    }

    @GetMapping("/with-employees")
    public List<Department> getAllDepartmentsWithEmployees(){
        log.info("Get all department with employees");
        return departmentService.getAllDepartmentsWithEmployees();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable  Long id){
        log.info("Get department by id {}", id);
        return departmentService.getDepartmentById(id);
    }


}
