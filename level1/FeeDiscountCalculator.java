package Assigned3.level1;

import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        double fee, discountPercent;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course fee (INR): ");
        fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );

        input.close(); 
    }
}