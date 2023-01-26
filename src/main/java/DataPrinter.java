public class DataPrinter {

    static void printData(SimplyMathematicLine[] simplyMathematicLines) {
        for (SimplyMathematicLine simplyMathematicLine : simplyMathematicLines) {
            System.out.println(simplyMathematicLine);
        }
    }

    static void printDataAndCountResult(SimplyMathematicLine[] simplyMathematicLines) {
        for (SimplyMathematicLine simplyMathematicLine : simplyMathematicLines) {
            double x = simplyMathematicLine.getX();
            String operator = simplyMathematicLine.getOperator();
            double y = simplyMathematicLine.getY();
            System.out.println(simplyMathematicLine + " = " + Calculator.count(x, operator, y));
        }
    }
}
