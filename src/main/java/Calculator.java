public class Calculator {

    static double calculate(double x, String operator, double y) {
        double result = 0;
        switch (operator) {
            case "+" -> result += x + y;
            case "-" -> result += x - y;
            case "*" -> result += x * y;
            case "/" -> result += x / y;
            default -> result = 0;
        }
        return result;
    }
}
