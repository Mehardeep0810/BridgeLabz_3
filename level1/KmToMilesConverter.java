package Assigned3.level1;

public class KmToMilesConverter {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double conversionFactor = 1.6;

        double miles = kilometers * conversionFactor;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}