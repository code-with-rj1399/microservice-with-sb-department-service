package com.microservices_with_sb.microservice_with_sb_department_service.client;

import com.microservices_with_sb.microservice_with_sb_department_service.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="microservice-with-sb-employee-service")
public interface EmployeeClient {

    @GetMapping("/employee/department/{departmentId}")
    List<Employee> getEmployeesByDepartment(@PathVariable Long departmentId);

}
