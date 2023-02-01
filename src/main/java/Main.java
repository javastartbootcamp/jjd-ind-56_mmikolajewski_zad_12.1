import java.io.*;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // uzupełnij rozwiązanie
        String fileName = "operations.txt";
        File file = new File(fileName);
        SimplyMathematicLine[] simplyMathematicLines;

        try {
            file.createNewFile();
            simplyMathematicLines = MathematicLineDataReader.readFile(fileName);
            DataPrinter.printData(simplyMathematicLines);
            DataPrinter.printDataAndCountResult(simplyMathematicLines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (
                FileWriter fileWriter = new FileWriter(file, false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for (SimplyMathematicLine simplyMathematicLine : simplyMathematicLines) {
                double x = simplyMathematicLine.getX();
                String operator = simplyMathematicLine.getOperator();
                double y = simplyMathematicLine.getY();
                bufferedWriter.write(simplyMathematicLine + " = " + Calculator.count(x, operator, y) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
//        1 + 2
//        2 + 2
//        3 - 1
//        2 * 4
//        11 / 2