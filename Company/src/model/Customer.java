package model;

import model.Enum.CustomerType;
import model.Enum.Gender;

public class Customer extends Person{
    String cusCode;
    CustomerType customerType;

    public Customer(String name, Gender gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);
    }

    public Customer(String name, Gender gender, String dateOfBirth, String cusCode, CustomerType customerType) {
        super(name, gender, dateOfBirth);
        this.cusCode = cusCode;
        this.customerType = customerType;
    }

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String
    toString() {
        return "Customer{" +
                "cusCode='" + cusCode + '\'' +
                ", customerType=" + customerType +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
