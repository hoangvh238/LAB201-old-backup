
package view;

import java.util.Scanner;

public class Menu {
    public static int getChoice(Object[] options)
    {


        for (int i = 0; i < options.length; i++) {
            if(i==0)
            {
                System.out.println("-------------------------------------------------------");
                if(options[i].equals("MENU"))
                System.out.printf("%-23s %-30s| \n","",options[i]);
                else
                    System.out.printf("%-19s %-34s| \n","",options[i]);
            }
            else
            {
                System.out.println("--------------------------------------------------------");
                System.out.printf("| %-3s|  %-45s |\n",i,options[i]);
            }

        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Nhập lựa chọn: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
