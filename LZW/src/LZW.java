import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LZW {
    static ArrayList<Integer> compressedData = new ArrayList<>();
    public static void compress(String uncompressedData) {
        // Khởi tạo bảng mã ban đầu
        HashMap<String, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < 256; i++) {
            dictionary.put("" + (char) i, i);
        }

        String current = "";
        int code = 256;

        for (char ch : uncompressedData.toCharArray()) {
            String next = current + ch;
            if (dictionary.containsKey(next)) {
                current = next;
                System.out.println("curren " +
                        "" +
                        ""+current);
            } else {
                compressedData.add(dictionary.get(current));
                dictionary.put(next, code);
                code++;
                current = "" + ch;
                System.out.println("curren "+current);
            }
        }


        if (!current.equals("")) {
            compressedData.add(dictionary.get(current));
        }
    }




    /// GIẢI MÃ
    public static void decompress(ArrayList<Integer> compressedData) {
        // Khởi tạo bảng mã ban đầu
        HashMap<Integer, String> dictionary = new HashMap<>();
        for (int i = 0; i < 256; i++) {
            dictionary.put(i, "" + (char) i);
        }

        String previous = "" + (char) (int) compressedData.remove(0);
        StringBuilder uncompressedData = new StringBuilder(previous);

        for (int code : compressedData) {
            String current = "";
            if (dictionary.containsKey(code)) {
                current = dictionary.get(code);
                System.out.println("curren "+current);
            } else// if (code == dictionary.size())
            {
                current = previous + previous.charAt(0);
                System.out.println("curren "+current);
            }
            uncompressedData.append(current);
            dictionary.put(dictionary.size(), previous + current.charAt(0));
            previous = current;
        }

        System.out.println("Uncompressed data: " + uncompressedData.toString());
    }

    public static void main(String[] args) {
        String uncompressedData = "ABABCABCDABCDE";
        System.out.print("Compressed data: ");
        compress(uncompressedData);
        System.out.println(Arrays.toString(compressedData.toArray()));
        System.out.println("DE-COMPRESSED");
        decompress(compressedData);

    }
}
