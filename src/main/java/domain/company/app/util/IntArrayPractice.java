package domain.company.app.util;

public class IntArrayPractice {
    public int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countOddNumbers(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (!(j % 2 == 0)) {
                count++;
            }
        }
        return count;
    }

    public int countPrimeNumbers(int[] arr) {
        int count = 0;
        for (int j : arr) {
            boolean divisible = false;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    divisible = true;
                    break;
                }
            }
            if (!divisible && j != 1 && j > 0) {
                count++;
            }
        }
        return count;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public int diffEvenIndexOddIndex(int[] arr) {
        int sumEvenIndex = 0;
        int sumOddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumEvenIndex += arr[i];
            } else {
                sumOddIndex += arr[i];
            }
        }
        return sumEvenIndex - sumOddIndex;
    }

    public int countZeros(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j == 0) {
                count++;
            }
        }
        return count;
    }
}
