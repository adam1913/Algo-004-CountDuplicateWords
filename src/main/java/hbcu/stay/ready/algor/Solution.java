package hbcu.stay.ready.algor;



import java.util.*;

public class Solution {

    public String countUniqueWords(String input) {

        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] look = sentence.split(" ");
        String word = look.toString();

        for (String x : look) {

            if (map.containsKey(x)) {
                int count = map.get(look);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);


            }
            Set<String> keys = map.keySet();

            TreeSet<String> sortedKeys = new TreeSet<>(keys);

            for (String str : sortedKeys);

        }
                return (word);
    }
}
