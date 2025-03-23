package java8.examples;

import java.time.temporal.Temporal;

public class DefaultMethods {
    public interface Logging {
        void log(String msg);

        //adding new method will clash with existing client class implementations (not backward compatible)
//        void log(String msg, Temporal date);
        default void log(String msg, Temporal date) {
            System.out.println(date.toString() + ": " + msg);
        }
    }

    public class LoggingImpl implements Logging {
        @Override
        public void log(String msg) {
            System.out.println(msg);
        }
    }
}
