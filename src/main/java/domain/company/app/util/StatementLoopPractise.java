package domain.company.app.util;

import java.util.Scanner;

public class StatementLoopPractise {

    public void tempReaction() {
        System.out.print("Введите температуру целым числом: ");
        Scanner inputInt = new Scanner(System.in);
        int temperature = inputInt.nextInt();
        if (temperature < 0) {
            System.out.println("Сейчас очень холодно");
        } else if (temperature <= 16) {
            System.out.println("Сейчас прохладно");
        } else {
            System.out.println("Отличный летний денек!");
        }
    }

    public void numberReaction() {
        System.out.print("Введите любое целое число: ");
        Scanner inputInt = new Scanner(System.in);
        int number = inputInt.nextInt();
        String result = number % 2 == 0 ? "Вы ввели четное число." : "Вы ввели нечетное число";
        System.out.println(result);
    }

    public enum DayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public void dayReaction(DayOfWeek day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Вы выбрали рабочий день");
            case SATURDAY, SUNDAY -> System.out.println("Вы выбрали выходной день");
            default -> System.out.println("Воодный параметр не является днем недели.");
        }
    }

    public void multiplyWhile() {
        int number = 1;
        while (number <= 512) {
            System.out.println(number);
            number = number * 2;

        }
    }

    public void doMultiplyWhile() {
        int number = 1;
        do {
            System.out.println(number);
            number = number * 2;
        } while (number <= 512);
    }

    public void calculateFactorial() {
        System.out.print("Введите любое целое положительное число: ");
        Scanner inputInt = new Scanner(System.in);
        int number = inputInt.nextInt();
        int factorial = 1;
        if (number <= 0) {
            System.out.println("Вы ввели не положительное число. Ваше число - " + number);
        } else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("Факториал числа " + number + ":" + factorial);
        }
    }
}

