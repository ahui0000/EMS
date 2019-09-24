package com.baizhi.dao;

import com.baizhi.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> selectAll();
    public void insert(Employee employee);
    public Employee selectById(Integer id);
    public void update(Employee employee);
    public void deleteById(Integer id);
}
