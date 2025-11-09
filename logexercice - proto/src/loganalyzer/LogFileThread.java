package loganalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LogFileThread extends Thread {
    private final Path file;
    private final List<LogEntry> globalLogList;

    public LogFileThread(Path file, List<LogEntry> globalLogList) {
        this.file = file;
        this.globalLogList = globalLogList;
    }

    @Override
    public void run() {

        }
    }
}
