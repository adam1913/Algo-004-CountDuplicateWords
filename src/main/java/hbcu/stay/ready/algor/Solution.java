package hbcu.stay.ready.algor;



import java.util.*;






public class Solution {

    public String countUniqueWords(String input) {
        String view = "";


        Map<String, Integer> map = new HashMap<String, Integer>();
        String modifiedInput = input.replace(".", "");
        String moreModifiedInput = modifiedInput.replaceAll("!", "");
        String[] look = moreModifiedInput.split(" ");


        for(String words : look) {
            if(!map.containsKey(words)) {
                map.put(words, 1);
            }
            else {
                int currentValue = map.get(words);
                currentValue++;
                map.put(words, currentValue);
            }
        }

        view += String.format("The %d unique words are:\n", map.size());
        int size = 0;
        for (String w : map.keySet()) {
            size++;
            int value = map.get(w);
            if (size < map.size()) {
                view += String.format("%s (Seen %d)\n", w, value);
            }
            else {
                view += String.format("%s (Seen %d)", w, value);
            }
        }

        return view;
    }
}










