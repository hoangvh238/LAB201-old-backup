package controller;

import model.Contact;
import validation.Inputter;
import validation.Validation;

import java.util.ArrayList;

public class ContactController {
    ArrayList<Contact> contacts = new ArrayList<>();
    public void inputInfo()
    {
        Inputter inputter = new Inputter();
        //id
        int id;
        if(contacts.isEmpty())id=1;
        else id = contacts.get(contacts.size()).getId()+1;
        //name
        String name = inputter.stringNotNum("Enter name : ");
        //f-name
        String fName = inputter.stringNotNum("Enter first name :");
        //l-name
        String lName = inputter.stringNotNum("Enter last name : ");
        //group()
        String group = inputter.stringNotNum("Enter group :");
        //adrr
        String addr = inputter.stringNotNum("Enter the address :");
        //String phone
        System.err.println("\n•\t1234567890\n" +
                "•\t123-456-7890\n" +
                "•\t123-456-7890 x1234\n" +
                "•\t123-456-7890 ext1234\n" +
                "•\t(123)-456-7890\n" +
                "•\t123.456.7890\n" +
                "•\t123 456 7890\n");
        String phone = inputter.inputPhone("Enter the phone number with form :");
        Contact contact = new Contact(id,name,fName,lName,group,addr,phone);
        contacts.add(contact);
        System.out.println("Successful");
    }
    public void display()
    {
        if(contacts.isEmpty()) System.err.println("Nothing to see !");
        else
        {
            System.out.println("--------------------------------- Display all Contact ----------------------------");
            System.out.printf("%-4s%-12s%-12s%-12s%-6s%-20s%-20s","ID","Name","First Name","Last Name","Group","Address","Phone");
            System.out.println("");
            for (Contact contact :contacts)
            {
                System.out.println(contact.toString());
            }
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }


    // delete
    public void deleteById() throws Validation {
        if(contacts.isEmpty())
        {
            System.err.println("Nothing to find !");
            return;
        }
        Inputter inputter = new Inputter();
        int id = inputter.inputPositiveInteger("Enter your id you want remove :");
        if(!deleteId(id)) System.err.println("Id not exits !");
    }
    boolean deleteId(int id)
    {
        for (Contact contact:contacts)
        {
            if(contact.getId()==id)
            {
                contacts.remove(contact);
                System.err.println("COMPLETE REMOVE");
                return true;
            }
        }
        return false;
    }
}
