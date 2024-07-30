package homeworks.intro;

public class Calculator {
    public static void main(String[] args) {
        if (args.length == 3) {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[2]);
            String operator = args[1];
            switch (operator) {
                case "+" -> System.out.println("Result: " + (a + b));
                case "-" -> {
                    System.out.println ("Result: " + (a - b));
                } case "*" -> {
                    System.out.println("Result: " +  (a * b));
                } case "/" -> {
                     if (b == 0) System.out.println("Error -can not calculate");
                                         else {System.out.println("Result: " + (a / b));}
                } case "%" -> {
                    if (b == 0) System.out.println("Error -can not calculate");
                                        else {System.out.println("Result: " + (a % b));}
                    System.out.println("Result: " +  (a % b));
                }
            }



        } else
        {System.err.println("3 arguments are needed");


        }
    }
}
