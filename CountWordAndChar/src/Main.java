import java.util.*;

public class Main {
    public static void main(String[] args) {
        //create
        LinkedHashMap<String,Integer> listCountWord = new LinkedHashMap<>();
        LinkedHashMap<Character,Integer> listCountChar = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.println("Enter your content: ");
        String inputString =scanner.nextLine().trim();
        String [] arrayCut = inputString.split("\\s+");
        //call function
        listCountWord = countWord(arrayCut);
        listCountChar = countChar(arrayCut);
        //display
        System.out.println(listCountWord.toString());
        System.out.println(listCountChar.toString());
    }
    public static LinkedHashMap<String, Integer> countWord(String [] input)
    {
        //add if nonExit and up if exits
        LinkedHashMap<String,Integer> listCountWord = new LinkedHashMap<>();
        for (String key :input) {
            if(listCountWord.containsKey(key)==false)listCountWord.put(key,1);
            else listCountWord.replace(key,listCountWord.get(key)+1);
        }
        return listCountWord;
    }
    public static LinkedHashMap<Character, Integer> countChar(String [] input)
    {
        LinkedHashMap<Character,Integer> listCountChar = new LinkedHashMap<>();
        for (String key:input) {
            for(int i=0;i<key.length();i++)
            {
                //add if nonExit and up if exits
                if(listCountChar.containsKey(key.charAt(i))==false)listCountChar.put(key.charAt(i),1);
                else listCountChar.replace(key.charAt(i),listCountChar.get(key.charAt(i))+1);

            }
        }
        return listCountChar;
    }
}