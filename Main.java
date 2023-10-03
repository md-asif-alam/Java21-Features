class Main{
    public static void main(String[] args) {
        System.out.println("Java 21 Features!!!");
        int a =20;
        int b=30;

        System.out.println(STR."The value of a is \{a}");
        System.out.println(STR."The value of b is \{b}");

        String title="Contact Page";
        String heading="Welcome to programming world!!";
        String body="String Template Features!!!";
        
        String html=STR."""
                <html>
                    <head>
                        <title>
                            \{title}
                        </title>
                    
                    </head>
                    <body>
                        <heading>\{heading}</heading>
                        <p>\{body}</p>
                    </body>
                </html>
                """;
        System.out.println(html);

        try {
            double d=100/0;
            System.out.println(d);
        } catch (Exception _) {
            // TODO: handle exception
            System.out.println("Error");
        }
    }
}