package courses.java.oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor

public class Circle  extends Shape {

    @Getter @Setter
    private  int radius;

    //constructor
    public Circle (String color, int vertices, int radius) {
        super(color, vertices);
        this.radius = radius;
    }

    // non static - needs to be called from the object
    public void printCircle(){
         System.out.println("Color: " + super.getColor());
         System.out.println("Vertices count: " + super.getVertices());
         System.out.println("Radius count: " + this.radius);
         System.out.println("------------------------");
    }



}
