package hbcu.stay.ready.algor;



import java.util.*;






public class Solution {

    public String countUniqueWords(String input) {
        String view = "";


        Map<String, Integer> map = new HashMap<>();


        String[] look = input.split("\\.|\\!|\\s");


        Integer count = 0;
        for (String words : look) {


            if (map.containsKey(words)) {

                map.put(words, count++);
            } else {
                map.put(words, 1);


            }

            


            view = "Seem" + map.keySet();
        }
        return view;
    }
}


