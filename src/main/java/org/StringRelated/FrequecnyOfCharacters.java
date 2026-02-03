package org.StringRelated;

import java.util.HashMap;

public class FrequecnyOfCharacters {
    public static void main(String[] args) {
        System.out.println(countCharacters("sohail"));
    }

    public static HashMap<Character, Integer> countCharacters(String str){
        HashMap<Character,Integer> map = new HashMap<>();

        for (char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        return map;
    }
}
