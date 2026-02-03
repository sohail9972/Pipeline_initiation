package org.nptel.Week1;
import java.util.Scanner;
public class volume_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();

        double volume= Math.PI * radius * radius*height;

        System.out.println(volume);
    }
}
