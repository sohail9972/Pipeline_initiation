package org.Program_Under_CI_CD;

public class LargestEvenNumber {

    public static String largestEven(String s){
        int lastTwoNumbersIndex = -1;

        for (int i =0;i<s.length();i++){
            if (s.charAt(i)=='2'){
                lastTwoNumbersIndex = i;
            }
        }

        if (lastTwoNumbersIndex==-1){
            return "";
        }

        return s.substring(0,lastTwoNumbersIndex+1);
    }
    public static void main(String[] args) {
        System.out.println(largestEven("221"));
    }
}
