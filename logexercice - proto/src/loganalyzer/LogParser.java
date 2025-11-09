package loganalyzer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class LogParser {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final Set<String> VALID_LEVELS = Set.of("INFO", "WARN", "ERROR");

    public static LogEntry parseLogLine(String line) throws IllegalArgumentException {
        String[] parts = line.split(" ", 4);

        if (parts.length < 4) {
            throw new IllegalArgumentException("Format de log invalide : " + line);
        }

        LocalDateTime timestamp = LocalDateTime.parse(parts[0] + " " + parts[1], dtf);
        ...

    }
}
