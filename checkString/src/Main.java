import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = keyboard.nextLine();

        ControllerString controllerString = new ControllerString();

        HashMap<String, List<Integer>> mapNum = controllerString.getNumber(input);
         HashMap<String, StringBuilder> mapString = controllerString.getCharacter(input);

        System.out.println("-----Result Analysis------");
        System.out.println("Perfect Square Numbers: "+ controllerString.squareNum(mapNum,input).toString());
        System.out.println("Odd Numbers: "+controllerString.oddNumber(mapNum,input).toString());
        System.out.println("Even numbers: "+controllerString.evenNum(mapNum,input).toString());
        System.out.println("All number : "+ mapNum.get(input).toString());
        System.out.println("Uppercase character: "+controllerString.upperChar(mapString,input));
        System.out.println("Lowercase character: "+controllerString.lowChar(mapString,input));
        System.out.println("Special character: "+controllerString.specChar(mapString,input));
        System.out.println("All character: "+mapString.get(input));
    }
}