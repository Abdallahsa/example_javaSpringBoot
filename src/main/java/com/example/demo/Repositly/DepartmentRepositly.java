package com.example.demo.Repositly;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositly extends JpaRepository<Department,Long> {
}
