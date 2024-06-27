import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("value "+anyToDec("217",16));
    }
    public static int anyToDec(String input,int type)
    {
        int sum=0;
        for(int i=0;i<input.length();i++)
        {
            sum += (input.charAt(input.length()-i-1)-48) * (int)Math.pow(type,i);
        }
        return  sum;
    }
    public static String decToAny(int input)
    {
        Stack stack = new Stack<>();

    }
}