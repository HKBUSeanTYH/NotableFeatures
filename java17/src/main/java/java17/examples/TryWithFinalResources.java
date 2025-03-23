package java17.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithFinalResources {
    /*
        prior to Java 9, only fresh variables can be used inside a try-with-resources block.
        This was especially verbose, however, now we can use final or effectively final variables
        inside the try-with-resources block as follows

        see also java8.examples.TryWithResources
     */
    public void resourceReaderNewWithEffectivelyFinal() {
        final BufferedReader br = new BufferedReader(new StringReader("Hello world example!"));
        try (br) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*
            finally clause + close not needed, because resource is implicitly closed.
         */
    }
}
