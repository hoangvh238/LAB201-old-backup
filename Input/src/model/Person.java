package model;

public class Person {
    String name;
    String address;
    double salary;

    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Information of Person you have entered:" + "\n" +
                "Name : " + name  + "\n"+
                "Address : " + address  +"\n"+
                "Salary : " + salary + "\n";
    }
}
