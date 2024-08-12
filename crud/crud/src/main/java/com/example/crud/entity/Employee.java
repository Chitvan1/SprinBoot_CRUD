package com.example.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    private String employeeName;

    private float employeeSalary;

    private String employeeDepartment;  // This field was missing

    public Employee() {
        // Default constructor
    }

    public Employee(Long employeeId, String employeeName, float employeeSalary, String employeeDepartment) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDepartment = employeeDepartment;  // Add this to the constructor
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDepartment() {  // Getter for employeeDepartment
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {  // Setter for employeeDepartment
        this.employeeDepartment = employeeDepartment;
    }
}
