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