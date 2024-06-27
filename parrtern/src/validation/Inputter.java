package validation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
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


    ///use



    //
    ArrayList<String> formCheck = new ArrayList<>();
    public String stringNotNum(String msg)
    {
        Pattern p = Pattern.compile("^[a-zA-Z ]+$");
        String value = null;
        while (true)
        {
            System.out.println(msg);
             value = keyboard.nextLine();
            Matcher matcher = p.matcher(value);
            if(!(matcher.find())) System.err.println("Re-enter( can't contain number or char )");
            else break;
        }
        return value;

    }

    //phone
    boolean checkPhone(String phone,String form,int index) {
        Pattern p = Pattern.compile(form);
        Matcher matcher = p.matcher(phone);
        if (matcher.find() == true) return true;
        else if (index < formCheck.size()-1) return checkPhone(phone, formCheck.get(++index), index);
        return false;
    }
    public String inputPhone(String msg)
    {
        String phone = null;
        formCheck.add("^[0-9]{10}$");
        formCheck.add("^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
        formCheck.add("^[0-9]{3}.[0-9]{3}.[0-9]{4}$");
        formCheck.add("^[0-9]{3} [0-9]{3} [0-9]{4}$");
        formCheck.add("^[0-9]{3}-[0-9]{3}-[0-9]{4} (x|ext)[0-9]{4}$");
        formCheck.add("^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$");
        while(true)
        {
            System.out.println(msg);
            phone = keyboard.nextLine();
            if(checkPhone(phone,formCheck.get(0),0)) break;
            System.err.println("Re-enter ! can't find form exits");
        }
        return phone;
    }
}
