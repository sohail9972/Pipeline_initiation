package org.Program_Under_CI_CD;

public class LargestNumberUsingStringBuilder {

    public static String largestNumberEven(String s){
        StringBuilder sb = new StringBuilder();
        int lastIndexForTwo = -1;

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            sb.append(c);
            if (c=='2'){
                lastIndexForTwo = sb.length()-1;
            }
        }

        if (lastIndexForTwo==-1){
            return "";
        }
       sb.setLength(lastIndexForTwo+1);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(largestNumberEven("12121212121"));
    }
}
