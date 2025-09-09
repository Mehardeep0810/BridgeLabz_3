package Assigned3.level1;

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
            "The distance in feet is " + distanceInFeet +
            ", which is " + String.format("%.2f", distanceInYards) + " yards" +
            " and " + String.format("%.4f", distanceInMiles) + " miles."
        );
        input.close();
    }
}
