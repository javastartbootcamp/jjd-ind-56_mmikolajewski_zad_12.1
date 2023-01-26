public class MathOperationLine {
    private double x;
    private String operator;
    private double y;

    public MathOperationLine(double x, String operator, double y) {
        this.x = x;
        this.operator = operator;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + operator + " " + y;
    }
}

