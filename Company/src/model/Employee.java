package model;

import model.Enum.Degree;
import model.Enum.Gender;

public class Employee extends Person{
    String empCode;
    Degree degree;

    public Employee(String name, Gender gender, String dateOfBirth, String empCode, Degree degree) {
        super(name, gender, dateOfBirth);
        this.empCode = empCode;
        this.degree = degree;
    }


    public String getEmpCode() {
        return empCode;
    }

    public Degree getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empCode='" + empCode + '\'' +
                ", degree=" + degree +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
