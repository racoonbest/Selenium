package stepDefinitions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utility {

    public static void write( String text, String file){
        try {
            TestSuiteSetup.writer = new BufferedWriter(new FileWriter(file));
            TestSuiteSetup.writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
