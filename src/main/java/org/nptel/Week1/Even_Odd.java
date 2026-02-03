package org.nptel.Week1;

import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number= in.nextInt();

        if (number%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
