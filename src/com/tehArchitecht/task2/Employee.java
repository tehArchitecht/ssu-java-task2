package com.tehArchitecht.task2;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private static List<Employee> allEmployees = new ArrayList<>();

    private String lastName;
    private String jobTitle;
    private double salary;
    private long yearOfBirth;

    public Employee() {
        lastName = "";
        jobTitle = "";
        salary = 0.0;
        yearOfBirth = 0;

        allEmployees.add(this);
    }

    public Employee(String lastName, String jobTitle, double salary, long yearOfBirth) {
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;

        allEmployees.add(this);
    }

    public static void increaseSalaryAll() {
        for (Employee employee : allEmployees) {
            employee.increaseSalary();
        }
    }

    public double increaseSalary() {
        return salary *= 1.15;
    }

    public long age() {
        return Year.now().getValue() - yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
