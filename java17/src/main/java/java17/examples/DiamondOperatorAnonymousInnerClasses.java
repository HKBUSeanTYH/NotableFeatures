package java17.examples;

public class DiamondOperatorAnonymousInnerClasses {
    public abstract static class StringAppender<T> {
        public abstract T append(String a, String b);
    }

    public static void main(String[] args) {
        StringAppender<String> appending = new StringAppender<>() {
            @Override
            public String append(String a, String b) {
                return new StringBuilder(a).append("-").append(b).toString();
            }
        };
        /*
            In Java 8, the above would fail to compile, because type arguments on constructor call cannot be inferred.
         */
    }
}
