package ru.task3;

public class Employee {

    String fullName;
    int age;
    String department;
    double salary;

    public Employee(String fullName, int age, String department, double salary) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Работник: " +
                "\n\tИмя: " + fullName +
                "\n\tВозраст: " + age +
                "\n\tДепартамент: " + department +
                "\n\tЗарплата: " + salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
