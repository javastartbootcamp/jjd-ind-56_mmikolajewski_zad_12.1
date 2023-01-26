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
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (int i = 0; i < simplyMathematicLines.length; i++) {
                double x = simplyMathematicLines[i].getX();
                String operator = simplyMathematicLines[i].getOperator();
                double y = simplyMathematicLines[i].getY();
                //bufferedWriter.write("\n" + simplyMathematicLines[i] + " = " + Calculator.count(x, operator, y));
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