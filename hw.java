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
public static double getAverage(int[] givenArray){
    double sum = 0;

    //calculates the sum of the array
    for(int i = 0; givenArray.length > i; i++){
        sum += givenArray[i];
    }
    return sum / givenArray.length;
}