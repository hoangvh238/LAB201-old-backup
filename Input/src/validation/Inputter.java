package validation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inputter {

    public static Scanner keyboard = new Scanner(System.in);



    public String inputNonEmpty(String msg) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(true)
        {
            try
            {
                System.out.println(msg);
                str = keyboard.nextLine().trim();
                if(str.isEmpty())throw new Validation("Please input data !");
                return str;

            }
            catch (Exception e)
            {
                System.err.println(e.getMessage());
            }
        }
    }



    ///

    //check user input string
    public String stringNotNum(String msg)
    {
        Pattern p = Pattern.compile("^[a-zA-Z ]+$");
        String value = null;
        while (true)
        {
            System.out.println(msg);
            value = keyboard.nextLine();
            Matcher matcher = p.matcher(value);
            if(!(matcher.find())) System.err.println("Re-enter( can't contain number or char )") ;
            else break;
        }
        return value.trim();
    }
//

    public  double checkInputSalary(String msg) {
        //loop until user input correct
        while (true) {
            try {
                System.out.println(msg);
                double result = Double.parseDouble(keyboard.nextLine().trim());
                if (result < 0) {
                    throw new Validation("Salary must be greater than 0");
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            } catch (Validation e) {
                System.err.println(e.getMessage());;
            }
        }
    }
    public int inputNumber(String msg)
    {
        int number;
        while(true)
        {
           try {
               System.out.println(msg);
               number = Integer.parseInt(keyboard.nextLine());
               if(number<=0) throw new Validation("Input >0");
               return number;
           }
           catch (Exception e)
           {
               System.err.println(e.getMessage());
           }
        }
    }
}

