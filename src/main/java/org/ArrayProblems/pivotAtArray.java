package org.ArrayProblems;

public class pivotAtArray {
    public static void main(String[] args) {

    }
    public static int[] pivotArray(int [] arr, int pivot){
        int n  = arr.length;
        int result =0;
        int count =0;
        int[] resultant= new int[n];

        for (int i :arr){
            if (i<pivot) resultant[result++]=i;
            if (i==pivot) count++;
        }
        while(count-- > 0){
            resultant[result++]=pivot;
        }
        for (int i:arr){
            if (i>pivot) resultant[result++]=i;
        }
        return resultant;
    }
}
