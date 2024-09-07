package courses.java.oop2;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape("fuchsia", 0);

            s1.setColor("red");
            System.out.println("the color is : " + s1.getColor());

            Circle c1= new Circle();
            c1.setVertices(1);
            c1.setRadius(5);
            c1.setColor("green");

            // System.out.println(c1.getColor());
             c1.printCircle();

            Circle c2= new Circle("white",7 ,7);
            Circle c3= new Circle("black", 1, 5);

                //non static call
                c2.printCircle();
                c3.printCircle();

                //static call
                Utils.printCircleStatic(c1);
                Utils.printCircleStatic(c2);
                Utils.printCircleStatic(c3);

                //Square area calculated through override method in Square
                Rectangle r1 = new Rectangle();
                Square sq1 = new Square(5);
                System.out.println(sq1.getArea());

        // polimorfism
            Shape r2 = new Rectangle(6,7);
            Shape sq2= new Square(8);


    }
    }
