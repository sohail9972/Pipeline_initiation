package org.StringRelated;

public class isSubsequence {
    public static void main(String[] args) {
        System.out.println(isValidSubsequence("sohail"));
    }
    public static boolean isValidSubsequence(String str){
        int i=0,j=0;
        while(i<str.length()&& j<str.length()){
            if(str.charAt(i)==str.charAt(j)){
                i++;
            }
            j++;
        }
        return i==str.length();
    }
}
