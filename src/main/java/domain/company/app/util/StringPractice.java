package domain.company.app.util;

public class StringPractice {
    //    Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    String myString = "I like Java!?#";

    public String manipulateString(int caseNumber) {
        String result = null;
        switch (caseNumber) {
            case 1:
                //    1. Распечатать последний символ строки. Используем метод String.charAt().
                result = String.valueOf(myString.charAt(myString.length() - 1));
                break;
            case 2:
                //    2. Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
                if (myString.endsWith("!!!")) {
                    result = "myString ends with '!!!'.";
                } else {
                    result = "myString does not ends with '!!!'.";
                }
                ;
                break;
            case 3:
                //    3. Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
                if (myString.startsWith("I like")) {
                    result = "myString starts with 'I like'.";
                } else {
                    result = "myString does not starts with 'I like'.";
                }
                ;
                break;
            case 4:
                //    4. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
                if (myString.contains("Java")) {
                    result = "myString contains the word 'Java'.";
                } else {
                    result = "myString does not contain the word 'Java'.";
                }
                ;
                break;
            case 5:
                //    5. Найти позицию подстроки “Java” в строке “I like Java!!!”.
                result = "'Java' starts on index " + myString.indexOf("Java") + " of " + myString;
                break;
            case 6:
                //    6. Заменить все символы “а” на “о”.
                result = myString.replace("a", "o");
                break;
            case 7:
                //    7. Преобразуйте строку к верхнему регистру.
                result = myString.toUpperCase();
                break;
            case 8:
                //    8. Преобразуйте строку к нижнему регистру.
                result = myString.toLowerCase();
                break;
            case 9:
                //    9. Вырезать строку Java c помощью метода String.substring().
                result = myString.substring(7, 7 + 4);
                break;
        }
        return result;
    }
}
