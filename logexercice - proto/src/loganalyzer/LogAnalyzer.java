package loganalyzer;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LogAnalyzer {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Path logDir = Paths.get("logs");

        List<Path> files;
        try (Stream<Path> paths = Files.list(logDir)) {
            files = paths.filter(Files::isRegularFile).collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Erreur accès dossier logs : " + e.getMessage());
            return;
        }

        System.out.println("Traitement avec Threads simples...");
        List<LogEntry> allEntriesThread = Collections.synchronizedList(new ArrayList<>());

        ...

        afficherStatistiques(allEntriesThread);

    }



    private static void afficherStatistiques(List<LogEntry> entries) {
        ...
    }
}
