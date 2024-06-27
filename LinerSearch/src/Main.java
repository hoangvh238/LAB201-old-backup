import java.security.Key;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array : ");
        int numberElement = scanner.nextInt();

        //get random array
        Random random = new Random();
        int []  array = new int[numberElement];
        for(int i= 0; i<numberElement;i++)
        {
            array[i]= random.nextInt(10 );
        }
        // get search value
        int valueSearch = 0;
        System.out.println("Enter the value want search :");
        valueSearch = scanner.nextInt();
        System.out.println("The array : "+ Arrays.toString(array));
        int key = isExitInArray(array,valueSearch);
        if(key!=-1) System.out.println("Found "+valueSearch+" at index: "+ key);
        else System.out.println("Not found");
    }
    public static int isExitInArray(int [] array, int searchValue)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==searchValue)
                return i;
        }
        return  -1;
    }

}