package org.StringRelated;

public class countTheSubsequence {
    public static void main(String[] args) {
        System.out.println(countMatchingSubsequence("the words has simple form of village", new String[]{"a"}));
    }

    public static int countMatchingSubsequence(String s,String[] words){
        int count=0;
        for (String word:words){
            if(isSubsequence(word,s)){
                count++;
            }
        }
        return count;
    }
    private static boolean isSubsequence(String s,String t){
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if (s.charAt(i)==t.charAt(j)) i++;
            j++;
        }
        return i==s.length();
    }
}
