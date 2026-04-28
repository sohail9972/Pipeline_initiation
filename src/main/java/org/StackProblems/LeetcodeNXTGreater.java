package org.StackProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetcodeNXTGreater {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[10001];
        Deque<Integer> st = new ArrayDeque<>();

        int n1=nums1.length;
        int n2= nums2.length;

        for (int i =n2-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
//storing the top of the Element
            result[nums2[i]]=st.isEmpty()?-1:st.peek();
            st.push(nums2[i]);
        }

        for (int i=0;i<n1;i++){
            nums1[i]=result[nums1[i]];
        }
        return nums1;
    }
    public static void main(String[] args) {

    }
}
