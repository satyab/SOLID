package SRP.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;

public class Persistence {

    public void saveToFile(Journal journal, String fileName, boolean overwrite)
        throws FileNotFoundException {

        if (overwrite || new File(fileName).exists()) {
            try (PrintWriter out = new PrintWriter(fileName)) {
                out.println(journal.toString());
            }
        }
    }

    public Journal load(String fileName) {
        throw new UnsupportedOperationException();
    }

    public Journal load(URL url) {
        throw new UnsupportedOperationException();
    }
}
