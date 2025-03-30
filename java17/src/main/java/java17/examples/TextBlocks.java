package java17.examples;

public class TextBlocks {
    /*
        Text block is an improvement on formatting String variables.
        From Java 15, we can write a String that spans through several lines as regular text.
     */
    public final static String html = """
                <!DOCTYPE html>
                <html>
                    <head>
                        <title>Example</title>
                    </head>
                    <body>
                        <p>This is an example of a simple HTML 
                        page with one paragraph.</p>
                    </body>
                </html>      
                """;
}
