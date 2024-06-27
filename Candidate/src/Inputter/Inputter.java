package Inputter;

import java.util.Scanner;

public class Inputter  {
    static Scanner scanner = new Scanner(System.in);

    public static int inputDayOfBirth() throws Validation
    {

        int year =0;
        while(true)
        {
            try {
                System.out.println("Enter birth day (>=1900) ");
                year = Integer.parseInt(scanner.nextLine());
                if(year<1900)throw new Validation("Invalid day");
                break;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("Re-enter");
            }
        }
        return year;
    }
    public static String inputPhone() throws Validation
    {
        String phone=null;
        while(true)
        {
            try {
                System.out.println("Enter phone number ( 10 char ) : ");
                phone = scanner.nextLine();
                if(phone.length()!=10)throw new Validation("Invalid phone");
                break;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("Re-enter");
            }
        }
        return phone;
    }
    public static String inputEmail() throws Validation
    {
        String email = null;
        while(true)
        {
            try {
                System.out.println("Enter email <account name>@<domain> : ");
                email = scanner.nextLine();
                if(!email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
                    throw new Validation("Invalid email");
                    else break;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("Re-enter");
            }
        }
        return email;
    }

    public static int inputYearExp() throws Validation
    {
        int year=0;
        while(true)
        {
            try {
                System.out.println("Enter the year exp : ");
                year = Integer.parseInt(scanner.nextLine());
                if(year>100||year<0)throw new Validation("Invalid year exp");
                break;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("Re-enter");
            }
        }
        return year;
    }
    public static String rankGra()
    {
        String rank=null;
        String rankBoard = new String("Excellence, Good, Fair, Poor");
        while(true)
        {
            try {
                System.out.println("Enter rank of gra : ");
                rank = scanner.nextLine();
                if(!rankBoard.contains(rank)) throw new Validation("Wrong rank");
                else
                break;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("Re-enter");
            }
        }
        return rank;
    }

}
