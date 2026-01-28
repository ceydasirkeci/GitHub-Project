package LAb;

import java.util.Random;
import java.util.Scanner;

class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        boolean isFinished = false;

        while (!isFinished) {
            // Display the menu
            System.out.println("\n---- Options Menu ----");
            System.out.println(" 1. Find Minimum Integer ");
            System.out.println(" 2. Find Maximum Integer ");
            System.out.println(" 3. Find The Average and Differences of Integers ");
            System.out.println(" 4. Find The Sum of Elements With Odd/Even Numbered Indexes ");
            System.out.println(" 5. Exit \n");

            System.out.println("Choose option no: ");

            // Get the option
            int optionNo = in.nextInt();

            // Do the functionality
            if (optionNo == 1) {
                getMin(array);
            } else if (optionNo == 2) {
                getMax(array);
            } else if (optionNo == 3) {
                getAverage(array);
            } else if (optionNo == 4) {
                displayOddEvenIndexSums(array);
            } else if (optionNo == 5) {
                isFinished = true;
            } else {
                System.out.println("Try again!!!");
            }
        }
    }
}