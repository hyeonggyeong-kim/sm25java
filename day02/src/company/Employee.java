package company;

import java.util.UUID;

public class Employee {
    private String empNo;
    private String   name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.empNo = UUID.randomUUID().toString();
        this.name = name;
        this.salary = salary;
    }

    public Employee(String empNo, String name, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "SecretaryEmployee{" +
                "empNo='" + empNo + '\'' +
                ", Name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public double getAnnualSalary() {
        return salary * 12;
    }
    public double setAnnualSalary(double taxRate) {
        return (salary * 12) - (salary * 12 * taxRate);
    }
}
