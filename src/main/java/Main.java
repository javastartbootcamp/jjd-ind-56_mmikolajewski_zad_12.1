import java.io.*;

class Main {
    public static void main(String[] args) {
        // uzupełnij rozwiązanie
        String fileName = "operations.txt";
        File file = new File(fileName);
        SimplyMathematicLine[] simplyMathematicLines;

        String fileResultName = "result.txt";
        File resultFile = new File(fileResultName);

        try {
            file.createNewFile();
            simplyMathematicLines = MathematicLineDataReader.readFile(fileName);
            DataWriter.writeResultToFile(simplyMathematicLines, resultFile);
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