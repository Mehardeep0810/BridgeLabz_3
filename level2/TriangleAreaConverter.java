package Assigned3.level2;

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
            "The Area of the triangle in sq in is " + String.format("%.2f", areaIn2) +
            " and sq cm is " + String.format("%.2f", areaCm2)
        );
        input.close();
    }
}
