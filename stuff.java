    public static double findMaxNumber (double [] numbers) {
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i]>max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMaxPos (double [] numbers) {
        int max = 0;
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i]>numbers[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int countOccurances (double [] numbers, double target) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count = count + 1;
            }
        }
        return count;
    }

    public static double findMinNumber (double [] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i]< min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int findMinPos (double [] numbers) {
        int min = 0;
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i]<numbers[min]) {
                min = i;
            }
        }
        return min;
    }

    public static Boolean linearSearch(double [] numbers, double target) {
        Boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
            }
        }

        return found;
    }
