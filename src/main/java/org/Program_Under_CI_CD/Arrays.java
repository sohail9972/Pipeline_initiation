package org.Program_Under_CI_CD;

public class Arrays {
    public static void main(String[] args) {
        int[] arr ={11,13,15,17};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int start=0;
        int last =nums.length-1;
//        int min_element =MIN_VALUE;
        while(start<last){
            int mid = start + (last-start)/2;

            if (nums[mid]<nums[last]){
                last=mid;
            }else {
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
