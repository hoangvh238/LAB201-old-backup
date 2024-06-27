package controller;

import model.Person;
import validation.Inputter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PersonController {
    Person[] listPerson ;
    Inputter inputter = new Inputter();


    public PersonController(int size)
    {
        this.listPerson = new Person[size];
        for(int i=0;i<size;i++) inputPerson(i);
    }

    public void inputPerson(int index)
    {
        System.out.println("INPUT");
        String name = inputter.stringNotNum("Please input name : ");
        String address = inputter.inputNonEmpty("Please input address :");
        double salary = inputter.checkInputSalary("Please input salary :");
        Person person = new Person(name,address,salary);
        listPerson [index] = person;
    }
    public void bubbleSort()
    {
        for (int i = 0; i < listPerson.length; i++) {
            for (int j = 1; j < listPerson.length - i; j++) {
                if (listPerson[j-1].getSalary() > listPerson[j].getSalary()) {
                    Person temp = listPerson[j];
                    listPerson[j] = listPerson[j-1];
                    listPerson[j-1] = temp;
                }
            }
        }
        System.out.println("COMPLETE SORT !");
    }
    public void display()
    {
        System.out.println("=====Management Person programmer=====");
        for (Person person :listPerson)
        {
            System.out.println(person.toString());
        }
        System.out.println("COMPLETE DISPLAY !");
    }
}

