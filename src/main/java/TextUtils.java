import java.io.*;
import java.util.Scanner;

public class TextUtils {

    static void readText(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }

    static MathOperationLine extractDigitsFromLineToObject(String line) {
        String[] split = line.split(" ");
        int x = Integer.parseInt(split[0]);
        String operator = split[1];
        int y = Integer.parseInt(split[2]);
        return new MathOperationLine(x, operator, y);
    }

    static String stickResultToMathOperation(MathOperationLine mathOperationLine, double mathResult) {
        return mathOperationLine + " = " + mathResult;
    }

    static int countFilesLines(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            scanner.nextLine();
        }
        return lines;
    }
}