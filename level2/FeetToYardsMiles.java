package Assigned3.level2;

import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        double distanceInFeet;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.println(
            "The distance in yards is " + String.format("%.2f", distanceInYards) +
            " while the distance in miles is " + String.format("%.4f", distanceInMiles)
        );
        input.close();
    }
}
