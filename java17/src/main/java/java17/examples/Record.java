package java17.examples;

import java.time.LocalDateTime;

public class Record {
    /*
        Java 16 - records which define immutable DTOs with less boilerplate
     */
    record Example(String name, LocalDateTime creation) {
        /*
            canonical constructor
         */
//        public Example(String name, LocalDateTime creation) {
//            if (name == null) {
//                throw new IllegalArgumentException("name should not be null");
//            }
//            if (creation == null) {
//                throw new IllegalArgumentException("creation time should not be null");
//            }
//            this.name = name;
//            this.creation = creation;
//        }
        /*
            compact constructor for records - signature is implicitly derived from components of the record
         */
        public Example {
            if (name == null) {
                throw new IllegalArgumentException("name should not be null");
            }
            if (creation == null) {
                throw new IllegalArgumentException("creation time should not be null");
            }
        }
    }

}
