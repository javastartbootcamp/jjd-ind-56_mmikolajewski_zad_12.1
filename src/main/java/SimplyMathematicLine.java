public class SimplyMathematicLine {
    private double x;
    private String operator;
    private double y;
    private double result;

    public SimplyMathematicLine(double x, String operator, double y) {
        this.x = x;
        this.operator = operator;
        this.y = y;
        this.result = Calculator.calculate(x, operator, y);
    }

    public double getX() {
        return x;
    }

    public String getOperator() {
        return operator;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return  x + " " + operator + " " +  y + " = " + result + "";
    }
}
