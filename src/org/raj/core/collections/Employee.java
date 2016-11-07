package org.raj.core.collections;

import java.util.Comparator;

/**
 * Created by rjk on 10/28/2016.
 */
public class Employee {
    private int id;
    private long salary;
    private String name;
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static Comparator<Employee> employeeIdComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getId() - o2.getId();
        }
    };

    public static Comparator<Employee> employeeSalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int)(o1.getSalary() - o2.getSalary());
        }
    };
}
