import java.util.Random;
import java.util.Scanner;

class Menu {
    //a method for getting the minimum integer from given array
    public static void getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        System.out.println("The minimum integer of the array: " + min);
    }

    //a method for getting the maximum integer from given array
    public static void getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println("The maximum integer of the array: " + max);
    }

    //gets Average
    public static void getAverage(int[] givenArray){
        double sum = 0;

        //calculates the sum of the array
        for(int i = 0; givenArray.length > i; i++){
            sum += givenArray[i];
        }
        double arrayAverage = sum / givenArray.length;
        System.out.println("The Array average is: " + arrayAverage);
        System.out.print("The differences from the average would be ");

        //prints differences
        for(int i = 0; givenArray.length > i; i++){
            System.out.print(givenArray[i] - arrayAverage + " ");
        }
        System.out.println();
    }

    // Method for finding the sum of elements with odd and even numbered indexes. 
    public static void displayOddEvenIndexSums(int [] givenArray) {
        int oddIndexSum = 0;
        int evenIndexSum = 0;

        for (int i = 0; i < givenArray.length ; i++){
            if (i % 2 == 0) {
                evenIndexSum += givenArray[i];
            }
            else {
                oddIndexSum += givenArray[i];
            }
        }

        //Printing out the output
        System.out.println("Sum of even indexes: " + evenIndexSum);
        System.out.println("Sum of odd indexes: " + oddIndexSum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // Get the array size
        System.out.print("Enter array size: ");
        int size = in.nextInt();

        int [] array = new int[size];

        // Fill the array with random integers
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101);
        }

        //prints randomized array
        System.out.print("Your array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        boolean isFinished = false;

        while (!isFinished) {
            // Display the menu
            System.out.println("\n---- Options Menu ----");
            System.out.println(" 1. Find Minimum Integer ");
            System.out.println(" 2. Find Maximum Integer ");
            System.out.println(" 3. Find The Average and Differences of Integers ");
            System.out.println(" 4. Find The Sum of Elements With Odd/Even Numbered Indexes ");
            System.out.println(" 5. Exit \n");

            System.out.print("Choose option no: ");

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
        in.close();
    }
}