package domain.company.app._main;

import domain.company.app.util.StringPractice;

public class _Main {
    public static void main(String[] args) {
        StringPractice practice = new StringPractice();
        System.out.println("My string: 'I like Java!?#'");
        int i;
        for (i = 1; i < 10; i++) {
            System.out.println("Practice #" + i);
            System.out.println(practice.manipulateString(i));

        }
    }
}