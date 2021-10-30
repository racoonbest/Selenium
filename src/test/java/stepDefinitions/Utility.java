package stepDefinitions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static stepDefinitions.TestSuiteSetup.writer;

public class Utility {

    public static void write(String text, String file) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(text);
    }
}
