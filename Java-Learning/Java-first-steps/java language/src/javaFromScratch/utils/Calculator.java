package javaFromScratch.utils;

public class Calculator {
    public static final double PI = 3.14159;
    // uma vez que o PI não mudará independente de onde for instanciada a Calculator, ele poderá ser um static final
    // o final equivale a declaração de constante, isto é, o valor permanecerá o mesmo, dando erro se tentar alterar via constructor

    // da mesma forma os cálculos não mudarão, independente do valor que chegue, por isso, poderão ser estáticos.
    // isso facilitará o uso, já que não será mais necessário instanciar a classe Calculator para utilizá-la:
    // Errado: Calculator calc = new Calculator(); calc.circumference(x)
    // Certo: Calculator.circumference(x)
    public static double circumference(double radValue) {
        return 2.0 * PI * radValue;
    }

    public static double volume(double volValue) {
        return (4.0 * PI * volValue * volValue *  volValue) / 3.0;
    }

    public static double sum(double... numbers) {
        double totalSum = 0;
        for (double number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public static double subtract(double... numbers) {
        double totalSubtract = 0;
        for (double number : numbers) {
            totalSubtract -= number;
        }
        return totalSubtract;
    }
}
