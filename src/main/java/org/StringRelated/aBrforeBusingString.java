package org.StringRelated;

public class aBrforeBusingString {
    public static void main(String[] args) {
        System.out.println(aBeforeBusingString("aaabbb"));
    }
    public static boolean aBeforeBusingString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a') {
                return false;
            }
        }
        return true;
    }
}
