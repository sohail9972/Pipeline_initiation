package org.StackProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class Temprature {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Deque<Integer> st = new ArrayDeque<>();
        for (int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? 0 : st.peek()-i;

            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {89,62,70,58,47,47,46,76,100,70};
        System.out.println(dailyTemperatures(arr));
    }
}
