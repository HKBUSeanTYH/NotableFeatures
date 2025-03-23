package java8.examples;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TypeAnnotations {
    /*
        https://dzone.com/articles/java-8-type-annotations
        Type annotations allow improved analysis of java code and can ensure stronger type checking.
        We can use type annotations now wherever we use a type. This means we can use them on:
            - local variable definitions
            - constructor calls
            - type casting
            - generics
            - throw clauses, implements clauses and more
     */

    public static void main(String[] args) {
        //local variable definition
        @NotNull String username = args[0];
        //constructor call
        List<String> req = new @NotEmpty ArrayList<>(Arrays.stream(args).collect(Collectors.toList()));
        //generic type
        List<@Email String> emails = new ArrayList<>();
        /*
            The above is a definition of list of email addresses. Using the email annotation, we can mark that
            every element of the list should be in desired email format. A tool can then use reflection to evaluate
            the annotation and check each element in the list is a valid email address.
         */
    }
}
