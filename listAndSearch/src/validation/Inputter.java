package validation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inputter {

    public static Scanner keyboard = new Scanner(System.in);
    //integer

    public String inputNonBlankString(String msg) throws Exception
    {
        String string = null;
        while(true)
        {
            try {
                System.out.println(msg);
                string = keyboard.nextLine();
                if(string.isEmpty())throw  new Validation("Please input url !");
                break;
            }
            catch(Exception e)
            {
                System.err.println(e.getMessage());
            }
        }
        return string.trim();
    }


}
