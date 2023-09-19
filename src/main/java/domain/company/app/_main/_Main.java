package domain.company.app._main;

import domain.company.app.util.GenerateRandomInt;
import domain.company.app.util.IntArrayPractice2;

import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int min = -50;
        int max = 50;
        GenerateRandomInt generateRandomInt = new GenerateRandomInt();
        IntArrayPractice2 secondPractice = new IntArrayPractice2();
        for (int i = 0; i < 4; i++) {
            arr[i] = generateRandomInt.generate(min, max);
        }
        System.out.println("Оригинальный массив из 4-x рандомальных чисел между " + min + " и " + max + ":");
        System.out.println(Arrays.toString(arr));
        System.out.println("Этот же массив отсортированный от наименьшого числа к наибольшему:");
        System.out.println(Arrays.toString(secondPractice.sortNumbers(arr)));
    }
}