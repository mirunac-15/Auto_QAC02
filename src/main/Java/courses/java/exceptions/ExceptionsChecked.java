package courses.java.exceptions;

public class ExceptionsChecked {
    public static void main(String[] args) {
        double radius =Double.parseDouble(args[0]);
        System.out.println(Areas.getCircleArea(radius));
    }
}
