package org.StringRelated;

public class aAppearsAfterB {
    public static void main(String[] args) {
        System.out.println(aBeforeB("aaabbb"));
    }
    public static boolean aBeforeB(String str){
        int count=0;
        char[] ch = str.toCharArray();
        int n= ch.length;
        for (int i=0;i<n-1;i++){
            if (ch[i]!='a' && ch[i+1]!='b'){
                return false;
            }
        }
        return true;
    }
}
