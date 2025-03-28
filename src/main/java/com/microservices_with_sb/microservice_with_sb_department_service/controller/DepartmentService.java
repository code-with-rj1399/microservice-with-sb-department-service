package com.microservices_with_sb.microservice_with_sb_department_service.controller;

import com.microservices_with_sb.microservice_with_sb_department_service.model.Department;
import com.microservices_with_sb.microservice_with_sb_department_service.repository.DepartmentInMemoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RequestMapping("/department")
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentInMemoryRepository departmentInMemoryRepository;


    public Department addDepartment(Department department){
        return departmentInMemoryRepository.addDepartment(department);
    }


    public List<Department> getAllDepartments(){
        return departmentInMemoryRepository.findAll();
    }

    public Department getDepartmentById(Long id){
        return departmentInMemoryRepository.findById(id);
    }


}
