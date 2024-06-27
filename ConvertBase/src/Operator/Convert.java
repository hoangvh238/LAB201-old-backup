package Operator;

import java.util.Stack;

public class Convert {
    public int allToDec(String input,int type)
    {
        int sum=0;
        for(int i=0;i<input.length();i++)
        {
            sum += (input.charAt(input.length()-i-1)-48) * (int)Math.pow(type,i);
        }
        return  sum;
    }
    public String decToAll(int input,int type)
    {
        Stack boxDiv = new Stack();
        // push mod value to stack
        while (input>0) {
            boxDiv.push(input % type);
            input /= type;
        }
        //pop value from stack to string
        String outputString = "";
        while (!boxDiv.isEmpty())
        {
            outputString+=boxDiv.pop();
        }
        return outputString;
    }
}
