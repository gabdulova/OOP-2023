package com.example.dao;

import com.example.model.Employee;

public interface EmployeeDAO {
    public void add(Employee e);
    public void update(Employee e);
    public void delete(int id);
    public Employee findById(int id);
    public Employee[] getAllEmployees();
}