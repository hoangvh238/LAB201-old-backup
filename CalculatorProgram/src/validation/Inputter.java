package validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Inputter {
    // cach su dung pattern check so
    // Pattern pattern = Pattern.Compiler("\\d*")
    //Match match = pattern.match(value);
    public static Scanner keyboard = new Scanner(System.in);
    //integer
    public int inputPositiveInteger(String msg) throws Validation{

        int number=0;

        while(true)
        {
            try {
                System.out.println(msg);
                number = Integer.parseInt(keyboard.nextLine());
                if(number<=0) throw new Validation("Can't input value smaller than 0");
                break;
            } catch(Exception e)
            {
                System.err.println(e.getMessage());
                System.err.println("Please re-enter");
            }
        }
        return number;
    }
    //double
    public double inputPositiveDouble(String msg) throws Validation{

        double number=0;

        while(true)
        {
            try {
                System.out.println(msg);
                number = Double.parseDouble(keyboard.nextLine());
                if(number<=0) throw new Validation("Can't input value smaller than 0");
                break;
            } catch(Exception e)
            {
                System.err.println(e.getMessage());
                System.err.println("Please re-enter");
            }
        }
        return number;
    }
    //double normal number
    public double inputDouble(String msg) throws Validation
    {
        double number=0;

        while(true)
        {
            try {
                System.out.println(msg);
                number = Double.parseDouble(keyboard.nextLine());
                break;
            } catch(Exception e)
            {
                System.err.println("Error type inputs");
                System.err.println("Please re-enter");
            }
        }
        return number;
    }
    //input char ( one char )
    public String inputChar(String msg) throws Validation
    {
        String charInput = null;
        String specChar = new String("+ = - * / ^ ");
        while(true)
        {
            try {
                System.out.println("");
                System.out.println(msg);
                charInput = keyboard.nextLine();
                if(charInput.length()!=1)throw new Validation("Please choice one operator !");
                if(!specChar.contains(String.valueOf(charInput.charAt(0)))) throw new Validation("Please input (+, -, *, /, ^) ");
                break;
            } catch(Exception e)
            {
                System.err.println(e.getMessage());
                System.err.println("Please re-enter");
            }
        }
        return String.valueOf(charInput.charAt(0));
    }

    public String choiceInput(String msg) throws Validation
    {
        String value = null;
        String choiceChar = "=";
        while(true)
        {
            try {
                System.out.println(msg);
                value = keyboard.nextLine();
                if(!(value.length()==0)) throw new Validation("Error input");
                if(!choiceChar.contains(String.valueOf(Character.toUpperCase(value.charAt(0)))))throw new Validation("Error input");
                break;
            } catch(Exception e)
            {
                System.err.println("Error type inputs");
                System.err.println("Please re-enter");
            }
        }
        return value.toUpperCase();
    }

    public String choiceInput()
    {
        String value = null;
        System.out.println("Enter your choice");
        value = keyboard.nextLine();
        return value;
    }
    //

}
