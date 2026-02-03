package org.Program_Under_CI_CD;

import java.util.HashMap;
import java.util.HashSet;

public class Continuous_Array {
    public static void main(String[] args) {
       int[] arr ={1,0,1,1,1,0,0,0};
        System.out.println(maximum_length(arr));
    }

    public static int maximum_length(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);  // sum is 0 at index -1;

        int sum=0;
        int maxLen=0;

        for (int i=0;i<nums.length;i++){
            sum +=(nums[i]==0) ? -1:1;


            if (map.containsKey(sum)){
                maxLen = Math.max(maxLen,i- map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
