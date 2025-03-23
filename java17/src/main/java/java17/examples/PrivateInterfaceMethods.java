package java17.examples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PrivateInterfaceMethods {
    public interface DataInterface {
        /*
            To provide better encapsulation and code reusability, private methods inside interfaces are supported as of Java 9
            The private method can be used anywhere within the interface
         */

        default List<String> readMonthlyFile() {
            return readFile("monthly.txt");
        }

        default List<String> readWeeklyFile() {
            return readFile("weekly.txt");
        }

        private List<String> readFile(String filename) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                return processReader(reader);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private List<String> processReader(BufferedReader reader) {
            List<String> list = new ArrayList<>();
            reader.lines().forEach(list::add);
            return list;
        }
    }
}
