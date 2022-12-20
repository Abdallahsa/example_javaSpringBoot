package com.example.demo.Services;

import com.example.demo.Repositly.DepartmentRepositly;
import com.example.demo.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServicesImp implements DepartmentServices {
    @Autowired
    private DepartmentRepositly departmentRepositly;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepositly.save(department);
    }
}
