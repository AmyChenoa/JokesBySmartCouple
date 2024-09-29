
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        String dateiPfad2 = "./Pictures/ascii-art-2.txt"; // Pfad zur Datei
        String inhalt = leseDateiInString(dateiPfad2);

        if (inhalt != null) {
            System.out.println("Inhalt der Datei: ");
            System.out.println(inhalt);
        } else {
            System.out.println("Fehler beim Lesen der Datei.");
        }
    }

    public static String leseDateiInString(String dateiPfad) {
        try {
            // Lies den gesamten Inhalt der Datei in einen String
            return new String(Files.readAllBytes(Paths.get(dateiPfad)));
        } catch (IOException e) {
            // Falls es ein Problem gibt, gib eine Fehlermeldung zurück
            e.printStackTrace();
            return null;
        }
    }
}


