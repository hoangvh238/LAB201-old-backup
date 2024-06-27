import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
            Scanner keyboard = new Scanner(System.in);
            Inputter inputter = new Inputter();
            int choice;
            while (true)
            {
                System.out.println("====== Validate Progaram ======");
                System.out.println("1. Check phone");
                System.out.println("2. Check mail");
                System.out.println("3. Check date");
                choice=Integer.parseInt(keyboard.nextLine());
                if(choice>3||choice<1)break;
                switch (choice)
            {
                case 1:
                    inputter.inputPhone("Phone number :");
                    break;
                case 2:
                    inputter.inputMail("Mail :");
                    break;
                case 3:
                    inputter.inputDate("Date :");
                    break;
            }
            }
    }
}