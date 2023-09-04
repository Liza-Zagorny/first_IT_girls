package domain.company.app.util;

public class IntArrayPractice2 {
    public int[] sortNumbers(int[] arr) {
        int temp;
        boolean isFinished = false;
        do {
            for (int i = 0; i < arr.length - 1; i++) {
                isFinished = true;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isFinished = false;
                }
            }
        } while (!isFinished);
        return arr;
    }
}
