package controller;

import Inputter.Inputter;
import model.Customer;
import model.Employee;
import model.Enum.CustomerType;
import model.Enum.Gender;

import java.util.ArrayList;

public class CompanyController {

    ArrayList<Employee> employeeList = new ArrayList<>();
    ArrayList<Customer> customersList = new ArrayList<>();

    public void inputByType(String type) {
        Inputter inputter = new Inputter();
        String name = inputter.stringNotNum("Enter your name :");
        String dateOfBirth = inputter.stringOnlyNum("Enter your birth year (yyyy) :");
        String code;
        if (type.contains("ae")) {
            if (employeeList.isEmpty()) {
                code = new String("e1");
            } else {
                code = employeeList.get(employeeList.size() - 1).getEmpCode();
                code = new String("e" + (Integer.parseInt(code.substring(1, code.length())) + 1));
            }
            employeeList.add(new Employee(name, inputter.inputGender("Choice gender :")
                    , dateOfBirth
                    , code
                    , inputter.inputDegree("Choice degree :")));
        }
        else
        {
            if(customersList.isEmpty())
            {
                code = new String("c1");
            }
            else
            {
                code =  customersList.get(customersList.size()-1).getCusCode();
                code = new String("c"+(Integer.parseInt(code.substring(1,code.length()))+1));
            }
            customersList.add(new Customer(name, inputter.inputGender("Choice gender :")
                    , dateOfBirth
                    , code
                    , inputter.inputCustomerType("Choice customer type :")));
        }
    }

    public void displayCustomer()
    {
        System.out.println("----------------Customer-------------------");
        if(customersList.isEmpty())
        {
            System.out.println("Nothing!");
            return;
        }
        for (Customer customer :customersList)
        {
            System.out.println(customer.toString());
        }
    }

    public void displayEmployee()
    {
        System.out.println("----------------Employee-------------------");
        if(employeeList.isEmpty())
        {
            System.out.println("Nothing!");
            return;
        }
        for (Employee employee :employeeList)
        {
            System.out.println(employee.toString());
        }
    }

    public void countByType()
    {
        System.out.println("----------------Customer-------------------");
        if(customersList.isEmpty())
        {
            System.out.println("Nothing!");
            return;
        }
        int news=0,mem=0,vip=0;
        for (Customer customer :customersList)
        {
            if(customer.getCustomerType().equals(CustomerType.news)) news++;
            else if(customer.getCustomerType().equals(CustomerType.member)) mem++;
            else vip++;
        }
        System.out.println("News :"+news +"  Member : "+mem+ " Vip"+vip);
    }
}
