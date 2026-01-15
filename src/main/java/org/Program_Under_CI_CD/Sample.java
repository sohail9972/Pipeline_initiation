package org.Program_Under_CI_CD;

public class Sample {

    public static String Example(String s){
        int lastIndexForTwo = -1;

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='2'){
                lastIndexForTwo = i;
            }
        }

        if (lastIndexForTwo==-1){
            return "";
        }
        return s.substring(0,lastIndexForTwo+1);
    }
    public static void main(String[] args) {

    }
}
