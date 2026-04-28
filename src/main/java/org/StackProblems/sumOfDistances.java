package org.StackProblems;

public class sumOfDistances {
    public static long[] distance(int[] nums) {
        int n = nums.length;
        long [] arr = new long[n];

        for(int i =0;i<n;i++){
            for (int j=i+1;j<n-1;j++){
                if (nums[j]==nums[i]){
                    arr[i] += Math.abs(i-j);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
