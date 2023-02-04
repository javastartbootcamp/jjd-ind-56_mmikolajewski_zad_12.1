import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {

    static void writeResultToFile(SimplyMathematicLine[] array, File fileName) throws IOException {
        try (
                FileWriter fileWriter = new FileWriter(fileName, false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for (SimplyMathematicLine simplyMathematicLine : array) {
                bufferedWriter.write(simplyMathematicLine.toString());
            }
        }
    }
}
