package Inputter;
import model.Enum.CustomerType;
import model.Enum.Degree;
import model.Enum.Gender;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inputter {

    public static Scanner keyboard = new Scanner(System.in);


    public Gender inputGender(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                System.out.println("1.Male");
                System.out.println("2.Female");
                System.out.println("Enter choice :");
                int choice = Integer.parseInt(keyboard.nextLine());
                for (Gender s : Gender.values()) {
                    if (s.getValue()==choice) {
                        return s;
                    }
                }
                throw new Validation("Please re-input gender");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public Degree inputDegree(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                System.out.println("1.Intermediate");
                System.out.println("2.College ");
                System.out.println("3.University ");
                System.out.println("Enter choice :");
                int choice = Integer.parseInt(keyboard.nextLine());
                for (Degree s : Degree.values()) {
                    if (s.getValue()==choice) {
                        return s;
                    }
                }
                throw new Validation("Please re-input degree");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public CustomerType inputCustomerType(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                System.out.println("1.New");
                System.out.println("2.Member ");
                System.out.println("3.Vip ");
                System.out.println("Enter choice :");
                int choice = Integer.parseInt(keyboard.nextLine());
                for (CustomerType s : CustomerType.values()) {
                    if (s.getValue()==choice) {
                        return s;
                    }
                }
                throw new Validation("Please re-input customer type");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }




    public String stringNotNum(String msg) {
        Pattern p = Pattern.compile("^[a-zA-Z ]+$");
        String value = null;
        while (true) {
            System.out.println(msg);
            value = keyboard.nextLine();
            Matcher matcher = p.matcher(value);
            if (!(matcher.find())) System.err.println("Re-enter( can't contain number or char )");
            else break;
        }
        return value;

    }

    public String stringOnlyNum(String msg)
    {
        Pattern p = Pattern.compile("^[0-9]+$");
        String value;
        while (true) {
            System.out.println(msg);
            value = keyboard.nextLine();
            Matcher matcher = p.matcher(value);
            if (!(matcher.find())) System.err.println("Re-enter( can't contain char )");
            if(Integer.parseInt(value)<1900) System.err.println("Re-enter wrong year");
            else break;
        }
        return value;
    }
}


