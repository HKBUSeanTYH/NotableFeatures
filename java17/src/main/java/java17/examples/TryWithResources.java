package java17.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResources {
    public void resourceReaderOld() {
        BufferedReader br = new BufferedReader(
                new StringReader("Hello world example!"));
        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void resourceReaderNew() {
        try (BufferedReader br = new BufferedReader(
                new StringReader("Hello world example!"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*
            finally clause + close not needed, because resource is implicitly closed.
         */
    }
}
