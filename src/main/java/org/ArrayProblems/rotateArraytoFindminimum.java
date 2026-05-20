package org.ArrayProblems;

public class rotateArraytoFindminimum {
    public static int findMinimumOnRotation(int[] nums){
        int start=0; int last=nums.length-1;
        while(start<last){
            int mid = start + (last-start)/2;
            
            if (nums[mid]>nums[last]){
                start = mid+1;
            } else if (nums[mid]< nums[last]) {
                last=mid;
            }
        }
        return nums[start];
    }
    
    public static void main(String[] args) {
        
    }
}
