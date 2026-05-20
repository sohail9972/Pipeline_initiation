package org.ArrayProblems;

public class PrifixCommonArray {
    public static int[] findPrefixCommonArray(int num1[] ,int num2[]){
        int n= num1.length;
        int[] freq = new int[n+1];
        int [] ans= new int[n];
        int common=0;

        for (int i =0;i<n;i++){
            freq[num1[i]]++;
            if (freq[num1[i]]==2){
                common++;
            }
            freq[num2[i]]++;
            if (freq[num2[i]]==2){
                common++;
            }
            ans[i]=common;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
