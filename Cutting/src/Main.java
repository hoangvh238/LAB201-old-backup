import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> points = new HashMap<String, Integer>();

        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);

        Map<String,Integer> sortMap = (Map<String, Integer>) points.entrySet();
        System.out.println(sortMap.toString());
    }
}