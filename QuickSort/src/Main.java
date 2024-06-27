import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array :");
        int numberElement = scanner.nextInt();

        // get random array
        int [] array = new int[numberElement];
        Random random = new Random();
        for(int i=0;i<numberElement;i++)array[i]= random.nextInt(10);

        //Display
        System.out.println("Unsorted array :"+ Arrays.toString(array));
        //
        quickSort(array,0,numberElement-1);
        //
        System.out.println("Sorted array : "+ Arrays.toString(array));

    }
    static void quickSort(int [] array,int iLeft,int iRight)
    {
        //check
        if(iLeft>=iRight)return;
        //find key

        int key = array[(iLeft+iRight)/2];

        //sort with key
        int k = partition(array,iLeft,iRight,key);

        //loop
        quickSort(array,iLeft,k-1);
        quickSort(array,k,iRight);

    }
    static int partition(int [] array, int iLeft,int iRight, int key)
    {
        while(iLeft<=iRight)
        {
            while (array[iLeft]<key)iLeft++;
            while ( array[iRight]>key)iRight--;
            if(iLeft<=iRight)
            {
                int a = array[iLeft];
                array[iLeft] = array[iRight];
                array[iRight] = a;
                iLeft++;iRight--;
            }
        }
        return  iLeft;
    }
}