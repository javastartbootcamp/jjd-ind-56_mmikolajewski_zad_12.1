import java.io.*;

class Main {
    public static void main(String[] args) {
        // uzupełnij rozwiązanie
        String fileName = "operations.txt";
        File file = new File(fileName);

        String fileResultName = "result.txt";
        File resultFile = new File(fileResultName);

        try {
            file.createNewFile();
            SimplyMathematicLine[] simplyMathematicalLines = MathematicLineDataReader.readFile(fileName);
            DataWriter.writeResultToFile(simplyMathematicalLines, resultFile);
            for (SimplyMathematicLine simplyMathematicalLine : simplyMathematicalLines) {
                System.out.println(simplyMathematicalLine);
            }
        } catch (IOException e) {
            System.out.println("Nie udało się wczytać pliku");
        }
    }
}
//        1 + 2
//        2 + 2
//        3 - 1
//        2 * 4
//        11 / 2