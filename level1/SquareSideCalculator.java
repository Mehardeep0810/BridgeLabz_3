package Assigned3.level1;

import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        double perimeter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println(
            "The length of the side is " + side +
            " whose perimeter is " + perimeter
        );
        input.close(); 
    }
}
