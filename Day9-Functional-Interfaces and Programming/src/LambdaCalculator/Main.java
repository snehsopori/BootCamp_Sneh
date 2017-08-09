package LambdaCalculator;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.cal(5,10,(double num1, double num2)->{
            System.out.println(num1 + num2);
        });
    }
}
