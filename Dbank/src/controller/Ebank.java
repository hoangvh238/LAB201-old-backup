package controller;

import model.Language;
import model.User.Information.Account;
import model.User.Information.Password;
import model.User.User;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ebank {
    Language language;
    Scanner scanner = new Scanner(System.in);
    public int menu()
    {
        int choice ;
        System.out.println("------Login Program------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English ");
        System.out.println("3. Exit");
        System.out.println("Please choice the option :");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public void display()
    {   int choice = menu();
        if(choice==1)language = new Language("vi");
        else language = new Language("en");
        if(choice==2 || choice ==1 ) login();
    }

     String inputAccount()
    {
        String account = null;
        while (true)
        {
            System.out.println(language.getLabels("accountNum"));
            account = scanner.nextLine().trim();
            if(!checkAccount(account)) System.out.println(language.getLabels("accountCheckNum"));
            else return account;
        }
    }

    boolean checkAccount(String input)
    {
        Pattern p = Pattern.compile("^[0-9]{10}$");

            Matcher matcher = p.matcher(input);
            if(!(matcher.find())) return false;
            return true;
    }

     String inputPassword()
    {
        String account = null;
        while (true)
        {
            System.out.println(language.getLabels("password"));
            account = scanner.nextLine().trim();
            if(!checkPassword(account)) System.out.println(language.getLabels("checkPassword"));
            else return account;
        }
    }
    boolean checkPassword(String input)
    {
        //((?=.*\\d) // ((?=.*[a-z])|| //
        Pattern p = Pattern.compile("^((?=.*[\\w])(?=.*[aA-zZ])(?=.*[0-9]).{8,31})$");
        Matcher matcher = p.matcher(input);
        if(!(matcher.find())) return false;
        return true;
    }

    String getCaptcha(int numberElement)
    {
        // 65-90 && 97-122
        Random random = new Random();
        StringBuilder captcha = new StringBuilder("");
        for(int i=0;i<numberElement;i++)
        {
            int range = random.nextInt((2-1)+1)+1;
            switch (range)
            {
                case 1: captcha.append((char)(random.nextInt((122 - 97) + 1) + 97)); break;

                case 2: captcha.append((char)(random.nextInt((90 - 65) + 1) + 65)); break;
            }
        }
        return captcha.toString();
    }

     boolean isCaptcha()
    {
        String captcha =  getCaptcha(4);
        String input;
        System.out.println(language.getLabels("captcha")+captcha);
        while(true)
        {
            System.out.print(language.getLabels("inputCaptcha"));
            input = scanner.nextLine().trim();
            System.out.println("");
            if(input.equals(captcha))return true;
            else System.out.println(language.getLabels("checkCaptcha"));
        }
    }


    public void login()
    {
        User user;
        String inputAccount = inputAccount();
        String inputPassword = inputPassword();
        if(isCaptcha()) {
            Password password = new Password(inputPassword);
            Account account = new Account(inputAccount);
            user = new User(account, password);
        }
    }

}
