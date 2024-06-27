import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inputter {
        Scanner keyboard = new Scanner(System.in);

        public String checkPhone (String phone)
        {
            Pattern p = Pattern.compile("^[0-9]+$");
            while(true)
            {
                try
                {

                    Matcher matcher = p.matcher(phone);
                    if(!matcher.find()) throw new Validation("Phone number must is number");
                    if(phone.length()!=10) throw new Validation("Phone number must be 10 digits");
                    break;
                }
                catch (Exception e)
                {
                    System.err.println(e.getMessage());
                    System.out.println("Phone number :");
                    phone = keyboard.nextLine();
                }
            }
            return phone;
        }


        public String checkEmail (String email)
        {
            Pattern p = Pattern.compile("^[a-zA-Z0-9.]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
            while(true)
            {
                try
                {

                    Matcher matcher = p.matcher(email);
                    if(!matcher.find()) throw new Validation("Email must is correct format");
                    break;
                }
                catch (Exception e)
                {
                    System.err.println(e.getMessage());
                    System.out.println("Email :");
                    email = keyboard.nextLine();
                }
            }
            return email;
        }

        public String checkDate(String date) throws ParseException
        {
            Date newdate = new Date();
            DateFormat dateFormat = null;
            dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            while(true)
            {
                try
                {
                    newdate =  dateFormat.parse(date);
                    if(!(dateFormat.format(newdate).equals(date)))throw new Validation("Date to correct format(dd/mm/yyyy)");
                    break;
                }
                catch (Exception e)
                {
                    System.err.println(e.getMessage());
                    System.out.println("Date :");
                    date = keyboard.nextLine();
                }
            }
            return date;
        }

        public String inputPhone(String msg)
        {
            System.out.println(msg);
            String phone = keyboard.nextLine();
            return checkPhone(phone);
        }
        public String inputMail (String msg)
         {
             System.out.println(msg);
             String mail = keyboard.nextLine();
             return checkEmail(mail);
         }
         public String inputDate (String msg) throws ParseException {
             System.out.println(msg);
             String date = keyboard.nextLine();
             return checkDate(date);
         }
}
