package SRP.solution;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        Journal j = new Journal();
        j.add("I am writing code");
        j.add("I am having lunch");

        Persistence p = new Persistence();
        String fileName = "my_journal.txt";
        p.saveToFile(j, fileName, true);

        Runtime.getRuntime().exec("open -a TextEdit " + fileName);
    }
}
