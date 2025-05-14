package LeetCode;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LeetCode.Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 75000, 1),
                new Employee("Alice", 85000, 2),
                new Employee("Bob", 65000, 3)
        );

    }
}
