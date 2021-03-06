package SRP.problem;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> entries;
    private int count;

    public Journal() {
        this.entries = new ArrayList<>();
        this.count = 0;
    }

    public void add(String text) {
        this.entries.add("" + (++count) + ": " + text);
    }

    public void remove(int index) {
        this.entries.remove(index);
    }

    public void save(String fileName) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.write(toString());
        }
    }

    public void load(String fileName) {
    }

    public void load(URL url) {
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), this.entries);
    }
}
