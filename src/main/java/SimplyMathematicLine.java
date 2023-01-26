@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class SimplyMathematicLine {
    private int x;
    private String operator;
    private int y;

    public SimplyMathematicLine(int x, String operator, int y) {
        this.x = x;
        this.operator = operator;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return  x + " " + operator + " " +  y;
    }
}
