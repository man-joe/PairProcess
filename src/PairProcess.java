/*
Start with the code below and create a program that will output the sum, product, and average of num1 and num2.
If the calculated sum is over 200, print an asterisk next to the sum.

Bonus: If the calculated sum is under 1000, it should have a tilde (~) printed next to it.
 */

import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {

        //added sum, product and average
        int num1, num2, sum, product;
        double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        // Calculations
        sum = num1 + num2;
        product = num1 * num2;
        average = sum / 2;

        System.out.print("Sum: " + sum);
        if(sum > 200)
            System.out.println("*");
        else if(sum < 1000)
            System.out.println("~");
        else
            System.out.println();

        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
    }

}