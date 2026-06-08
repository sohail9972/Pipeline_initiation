package org.StringRelated;

import java.util.HashSet;

public class CountSpecialCharacter {
    public static void main(String[] args) {

    }
    public static int countSpecialChar(String word){
        HashSet<Character> set = new HashSet<>();
        for (char ch:word.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for (char ch='a';ch<='z';ch++){
            if (set.contains(ch) && set.contains(Character.toUpperCase(ch))){
                count++;
            }
        }
        return count;
    }
}
