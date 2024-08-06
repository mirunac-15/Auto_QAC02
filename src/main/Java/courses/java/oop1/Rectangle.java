package courses.java.oop1;

public class Rectangle {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.width = width;
        this.lenght = lenght;
    }


    public double getArea() {
        return this.lenght * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.lenght + this.width);
    }

    public double getDiagonal() {
        return Math.sqrt((this.lenght + this.lenght) + (this.width + this.width));


    }
}