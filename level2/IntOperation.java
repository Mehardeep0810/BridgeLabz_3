package Assigned3.level2;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        a = input.nextInt();

        System.out.print("Enter value for b: ");
        b = input.nextInt();

        System.out.print("Enter value for c: ");
        c = input.nextInt();

        int result1 = a + b * c;       
        int result2 = a * b + c;       
        int result3 = c + a / b;      
        int result4 = a % b + c;       

        System.out.println(
            "The results of Int Operations are:\n" +
            "a + b * c = " + result1 + "\n" +
            "a * b + c = " + result2 + "\n" +
            "c + a / b = " + result3 + "\n" +
            "a % b + c = " + result4
        );
        input.close();
    }
}
