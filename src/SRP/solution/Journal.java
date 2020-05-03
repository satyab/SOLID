package SRP.solution;

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

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), this.entries);
    }
}
