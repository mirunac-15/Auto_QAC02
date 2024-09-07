package courses.java.oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor

public class Shape {

    @Getter @Setter
    private String color;

    @Getter @Setter
    private int vertices ;

    public int getArea () {
    return 0;
}
}