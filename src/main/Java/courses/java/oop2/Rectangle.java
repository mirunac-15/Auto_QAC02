package courses.java.oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Rectangle extends Shape {

    @Getter @Setter
    private int height;

    @Getter @Setter
    private int width;

    public int getArea() {
        System.out.println("Method from Rectangle called!");
        return width * height;
    }
}
