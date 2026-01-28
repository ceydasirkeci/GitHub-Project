public static int getMin(int array[]) {
    int min = Integer.MAX_VALUE;
    for (int a : array) {
        if (a < min) {
            min = a;
        }
    }
    return min;
}

public static int getMax(int array[]) {
    int max = Integer.MIN_VALUE;
    for (int a : array) {
        if (a > max) {
            max = a;
        }
    }
    return max;
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