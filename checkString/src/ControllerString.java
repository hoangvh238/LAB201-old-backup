import java.util.*;

  public class ControllerString {


     public HashMap<String, List<Integer>> getNumber(String input)
    {
        HashMap<String,List<Integer>> hashInt = new HashMap<>();
        LinkedList<Integer> listInt = new LinkedList<>();

        String onlyNum = input.replaceAll("\\D+",",");
        String result [] = onlyNum.split(",");

        for(int i=0;i<result.length;i++)
        {
            try{
                int num = Integer.parseInt(result[i]);
                if(num > -1) listInt.add(num);
            }
            catch (Exception e)
            {

            }
        }
        if(!listInt.isEmpty()) hashInt.put(input,listInt);

        return hashInt;
    }

      public HashMap<String, StringBuilder> getCharacter(String input)
    {
        HashMap<String,StringBuilder> hashChar = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        String onlyChar = input.replaceAll("\\d","0");
        String result [] = onlyChar.split("0");

        for(int i=0;i<result.length;i++)
        {
           if(result[i]!=null)stringBuilder.append(result[i]);
        }
        if((stringBuilder!=null)) hashChar.put(input,stringBuilder);

       return hashChar;
    }

      public  List<Integer> squareNum (HashMap<String, List<Integer>> mapInt, String input)
    {
        List<Integer> listNum = mapInt.get(input);
        List<Integer> listInt = new ArrayList<>();

        for (Integer num:listNum)
        {
            if(Math.pow(2,Math.sqrt(num))==num) listInt.add(num);
        }
        return listInt;
    }

      public List<Integer> oddNumber (HashMap<String,List<Integer>> mapInt, String input){
        List<Integer> listNum = mapInt.get(input);
        List<Integer> listOdd = new ArrayList<>();

        for (Integer num:listNum)
        {
            if(num%2!=0) listOdd.add(num);
        }

        return listOdd;
    }

      public List<Integer> evenNum (HashMap<String,List<Integer>> mapInt, String input){
        List<Integer> listNum = mapInt.get(input);
        List<Integer> listEven = new ArrayList<>();

        for (Integer num:listNum)
        {
            if(num%2==0) listEven.add(num);
        }

        return listEven;
    }

      public String upperChar( HashMap<String, StringBuilder> mapString, String input)
    {
        String string = String.valueOf(mapString.get(input));
        return string.replaceAll("[a-z]|[0-9]|\\W","");
    }

      public String lowChar( HashMap<String, StringBuilder> mapString, String input)
    {
        String string = String.valueOf(mapString.get(input));
        return string.replaceAll("[A-Z]|[0-9]|\\W","");
    }

      public  String specChar ( HashMap<String, StringBuilder> mapString, String input)
    {
        String string = String.valueOf(mapString.get(input));
        return string.replaceAll("\\w","");
    }
}
