package domain.company.app._main;
import static domain.company.app.service.ResultWriterService.printer;
import static domain.company.app.util.Calculator.addition;
import static domain.company.app.util.Calculator.subtraction;
import static domain.company.app.util.Calculator.multiplication;

public class _Main {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;

        int additionResult = addition(num1, num2);
        printer( num1, num2,additionResult, "addition" );

        int subtractionResult = subtraction(num1, num2);
        printer( num1, num2,subtractionResult, "subtraction" );

        int multiplicationResult = multiplication(num1, num2);
        printer( num1, num2,multiplicationResult, "multiplication" );




    }


}