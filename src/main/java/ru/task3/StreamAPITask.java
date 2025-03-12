package ru.task3;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamAPITask {

    public static void main(String[] args) {
        ArrayList<Employee> employeesArray = getEmployees();

        Stream<Employee> employeesStream = employeesArray.stream();

        boolean isRichEmployeeExists = employeesStream
                .anyMatch(employee -> employee.salary > 100000);


        if (isRichEmployeeExists) {
            System.out.println("Employees with salary > 100000 exists");
            employeesStream = employeesArray.stream();
            employeesStream
                    .filter(employee -> employee.salary > 100000)
                    .forEach(System.out::println);
        } else {
            System.out.println("Employee with salary > 100000 not exists");
        }
    }

    private static ArrayList<Employee> getEmployees() {
        Employee Employee1 = new Employee("John", 25, "HR", 135000);
        Employee Employee2 = new Employee("Jane", 40, "HR", 160000);
        Employee Employee3 = new Employee("Sigma", 21, "Accounting", 65000);
        Employee Employee4 = new Employee("Jack", 24, "Production ", 10000);
        Employee Employee5 = new Employee("Venam", 35, "Accounting", 75000);

        return new ArrayList<Employee>() {{
            add(Employee1);
            add(Employee2);
            add(Employee3);
            add(Employee4);
            add(Employee5);
        }};
    }

}
