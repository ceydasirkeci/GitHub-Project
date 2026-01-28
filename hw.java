//a method for getting the minimum integer from given array
public static void getMin(int[] array) {
    int min = Integer.MAX_VALUE;
    for (int a : array) {
        if (a < min) {
            min = a;
        }
    }
    System.out.println(min);
}

//a method for getting the maximum integer from given array
public static void getMax(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int a : array) {
        if (a > max) {
            max = a;
        }
    }
    System.out.println(max);
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
public static void displayOddEvenIndexSums() {
    int oddIndexSum = 0;
    int evenIndexSum = 0;

    for (int i = 0; i < array.length ; i++){
        if (i % 2 == 0) {
            evenIndexSum += array[i];
        }
        else {
            oddIndexSum += array[i];
        }
    }

    //Printing out the output
    System.out.println("Sum of even indexes: " + evenIndexSum);
    System.out.println("Sum of odd indexes: " + oddIndexSum);
}