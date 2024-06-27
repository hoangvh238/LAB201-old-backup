import Operator.InputController;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //enter type input
        System.out.println("Enter your input type");
        System.out.println("1.Binary");
        System.out.println("2.Decimal");
        System.out.println("3.Hexadecimal");
        int inputChoice = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter value convert ");
        String inputString = scanner.nextLine().trim();
        //enter type output
        System.out.println("Enter your output type");
        System.out.println("1.Binary");
        System.out.println("2.Decimal");
        System.out.println("3.Hexadecimal");
        int outputChoice = Integer.parseInt(scanner.nextLine());
        if(inputChoice==outputChoice) System.out.println("Nothing to convert !");
        else
        {
            InputController inputController = new InputController();
            inputController.directConvert(inputChoice,outputChoice,inputString);
        }
    }

}