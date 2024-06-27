package Operator;

public class InputController {
    public void directConvert(int input,int output,String value)
    {
        int returnDec=0;
        Convert convert = new Convert();
        if(input!=2)
        {
            returnDec = convert.allToDec(value,(input==1)?2:16);
        }
        else returnDec = Integer.parseInt(value);
        if(output==2)
        {
            System.out.println("The decimal convert is "+ returnDec);
        }
        else {
            String finalValue = convert.decToAll(returnDec,(output==1)?2:16);
            System.out.println("The "+((output==1)?"binary":"hec")+" convert is "+finalValue);
        }

    }

}
