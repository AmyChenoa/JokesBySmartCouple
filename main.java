import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class main {

    public static void main(String[] args) {
        try {
            String filePath = ".\\picture\\wolf-art.txt"; // Pfad zur Textdatei anpassen
            String fileContent = readFileToString(filePath);
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFileToString(String filePath) throws IOException {
        // Lesen Sie den gesamten Dateiinhalt in einen String
        byte[] encoded = Files.readAllBytes(Paths.get(filePath));
        return new String(encoded, StandardCharsets.UTF_8);
    }

}

// qulle Image to Ascii art: https://www.asciiart.eu/animals/wolves