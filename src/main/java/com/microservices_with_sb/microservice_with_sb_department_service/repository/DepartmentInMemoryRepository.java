package com.microservices_with_sb.microservice_with_sb_department_service.repository;

import com.microservices_with_sb.microservice_with_sb_department_service.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class DepartmentInMemoryRepository {

    private static List<Department> departmentList = new ArrayList<>();

    static {
        departmentList.add(Department.builder()
                        .id(1L)
                        .name("DS")
                .build());
        departmentList.add(Department.builder()
                .id(2L)
                .name("Java")
                .build());
        departmentList.add(Department.builder()
                .id(3L)
                .name("MySQL")
                .build());
    }

    public Department addDepartment(Department department){
        departmentList.add(department);
        return department;
    }

    public Department findById(Long id){
        return departmentList.stream().filter(d -> Objects.equals(d.getId(), id)).findFirst().orElseThrow();
    }

    public List<Department> findAll(){
        return departmentList;
    }
}
