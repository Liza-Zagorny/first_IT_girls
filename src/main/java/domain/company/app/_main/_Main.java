package domain.company.app._main;

import domain.company.app.util.GenerateRandomInt;
import domain.company.app.util.IntArrayPractice;

import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int min = -50;
        int max = 50;
        GenerateRandomInt generateRandomInt = new GenerateRandomInt();
        IntArrayPractice intArrayPractice = new IntArrayPractice();
        for (int i = 0; i < 10; i++) {
            arr[i] = generateRandomInt.generate(min, max);
        }
        System.out.println("Оригинальный массив из 10-и рандомальных чисел между " + min + " и " + max + ":");
        System.out.println(Arrays.toString(arr));
        System.out.println("1. Количество четных чисел в массиве: " + intArrayPractice.countEvenNumbers(arr));
        System.out.println("2. Количество нечетных чисел в массиве: " + intArrayPractice.countOddNumbers(arr));
        System.out.println("3. Количество простых чисел в массиве: " + intArrayPractice.countPrimeNumbers(arr));
        System.out.println("4. Сумма всех чисел в массиве: " + intArrayPractice.sum(arr));
        System.out.println("5. Разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве:" + intArrayPractice.diffEvenIndexOddIndex(arr));
        System.out.println("6. Количество нулей в массиве:" + intArrayPractice.countZeros(arr));
    }
}