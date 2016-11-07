package org.raj.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by rjk on 10/28/2016.
 */
public class ComparatorTester {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setSalary(10000L);
        employee.setName("Raj");

        Employee employee1 = new Employee();
        employee.setId(2);
        employee.setSalary(20000L);
        employee.setName("KAtipally");

        Employee employee3 = new Employee();
        employee.setId(3);
        employee.setSalary(30000L);
        employee.setName("Reddy");

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee3);

        Collections.sort(employeeList, Employee.employeeIdComparator);
    }
}
