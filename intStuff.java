public static int findMaxNumber (int [] numbers) {
        int max = numbers[0];
        for (int index = 1; index < numbers.length; index++){
            if(numbers[index]>max) {
                max = numbers[index];
            }
        }
        return max;
    }

    public static int findMaxPos (int [] numbers) {
        int maxIndex = 0;
        for (int index = 1; index < numbers.length; index++){
            if(numbers[index]>numbers[maxIndex]) {
                maxIndex = index;
            }
        }
        return maxIndex;
    }

    public static int countOccurances (int [] numbers, int target) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count = count + 1;
            }
        }


        return count;
    }

    public static int findMinNumber (int [] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i]< min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int findMinPos (int [] numbers) {
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i]<numbers[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static Boolean linearSearch(int [] numbers, int target) {
        Boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
            }
        }

        return found;
    }
