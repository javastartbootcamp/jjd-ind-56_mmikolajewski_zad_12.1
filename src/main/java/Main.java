import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // uzupełnij rozwiązanie

        String fileName = "operations.txt";
        int linesNumberInFile = TextUtils.countFilesLines(fileName);
        String[] countedLines = new String[linesNumberInFile];

        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {
                int stringNumber = 0;
                String line = scanner.nextLine();
                MathOperationLine mathOperationLine = TextUtils.extractDigitsFromLineToObject(line);
                double result = Calculator.count(mathOperationLine.getX(), mathOperationLine.getOperator(), mathOperationLine.getY());
                String countedMathOperation = TextUtils.stickResultToMathOperation(mathOperationLine, result);
                System.out.println(countedMathOperation);

                countedLines[stringNumber] = countedMathOperation;
                stringNumber += 1;

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Nie udało sie wczytać pliku: " + fileName);
        }
    }
}