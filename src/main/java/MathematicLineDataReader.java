import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MathematicLineDataReader {

    static SimplyMathematicLine[] readFile(String fileName) throws FileNotFoundException {
        final int linesNumber = countLines(fileName);
        SimplyMathematicLine[] simplyMathematicLines = new SimplyMathematicLine[linesNumber];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (int i = 0; i < simplyMathematicLines.length; i++) {
                String txtLine = scanner.nextLine();
                simplyMathematicLines[i] = createMathOperationFromTxt(txtLine);
            }
        }
        return simplyMathematicLines;
    }

    private static SimplyMathematicLine createMathOperationFromTxt(String txtLine) {
        String[] data = txtLine.split(" ");
        double x = Double.parseDouble(data[0]);
        String operator = data[1];
        double y = Double.parseDouble(data[2]);
        return new SimplyMathematicLine(x, operator, y);
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        }
        return lines;
    }
}
