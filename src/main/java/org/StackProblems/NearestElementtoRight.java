package org.StackProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class NearestElementtoRight {

    public static int[] GreaterToRight(int[] nums){
        int n= nums.length;
        int[] result =new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for (int i=n-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]=-1;
            }else {
                //Top of the stack is the nearest greater element
                result[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        System.out.println(GreaterToRight(arr));
    }
}
