package Assigned3.level1;

import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        double base, height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;

        double areaIn2 = areaCm2 * 0.1550;

        System.out.println(
            "Your Height in cm is " + height +
            " while in feet is " + String.format("%.2f", height / 30.48) +
            " and inches is " + String.format("%.2f", height / 2.54) + "\n" +
            "The area of the triangle is " + String.format("%.2f", areaCm2) + " cm²" +
            " and " + String.format("%.2f", areaIn2) + " in²"
        );
        input.close(); 
    }
}