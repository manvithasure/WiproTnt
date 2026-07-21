import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String input = sc.nextLine();

        System.out.println("Enter the output file name");
        String output = sc.nextLine();

        File file = new File(input);
        Scanner fileScanner = new Scanner(file);

        TreeMap<String, Integer> map = new TreeMap<>();

        while (fileScanner.hasNext()) {
            String word = fileScanner.next().toLowerCase();

            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }

        fileScanner.close();

        FileWriter fw = new FileWriter(output);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            fw.write(entry.getKey() + " : " + entry.getValue() + "\n");
        }

        fw.close();

        System.out.println("Word count written to " + output);
    }
}