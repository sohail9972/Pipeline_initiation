package org.ArrayProblems;

public class RotationMedium {

    public static int rotateArrayWithDuplicates(int[] nums){
        int start =0; int last = nums.length-1;
        while(start<last){
            int mid = start + (last-start)/2;
            if (nums[mid]>nums[last]){
                start = mid+1;
            } else if (nums[mid]<nums[last]) {
                last=mid;
            }else{
                last--;
            }
        }
        return nums[start];
    }
    public static void main(String[] args) {

    }
}
