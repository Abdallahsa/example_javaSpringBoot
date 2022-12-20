package com.example.demo.Controller;

import com.example.demo.Services.DepartmentServices;
import com.example.demo.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentServices departmentServices;
    @PostMapping( "/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentServices.saveDepartment(department);
    }
}
