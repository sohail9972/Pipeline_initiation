package org.Grid;

import java.util.*;

public class MinimumOperationPerformed {

    public int minOperations(int[][] grid, int x) {

        List<Integer> list = new ArrayList<>();
        int remainder = grid[0][0] % x ;

//        Converting grid to Flattned

        for (int[] row:grid){
            for(int num:row){
//                Here I am checking is it Possible to Match number Else return -1
                if(num%x !=remainder){
                    return -1;
                }
                list.add(num);
            }
        }
//        Sorting numbers to find median
        Collections.sort(list);

        int target = list.get(list.size() /2);  // this is where i will find median

//        Performing Operation = num-target /x
        int operation=0;
        for (int num:list){
            operation +=Math.abs(num-target)/x;
        }
return operation;

    }


    public static void main(String[] args) {

    }
}
