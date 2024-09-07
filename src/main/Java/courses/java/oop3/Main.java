package courses.java.oop3;

import courses.java.oop2.*;
import courses.java.oop2.Shape;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] values = {1, 5, 7};
        System.out.println(values[2]);

        Shape[] shapes = {new Square(),
                new Triangle(),
                new Circle()};
        Shape[] sh2 = new Shape[5];
        sh2[0] = new Circle(5);
        sh2[0].setColor("Blue");

        System.out.println(sh2[0].getColor());
        ((Circle) sh2[0]).printCircle();
        Circle[] circ2 = {new Circle(1), new Circle(2)};
        circ2[0].printCircle();

        for (Circle s : circ2) {
            s.printCircle();
        }
        ;

// we don't use this because it is prone to mistakes
        ArrayList l = new ArrayList();
        l.add("Ana");
        l.add("are");
        l.add("mere");

    System.out.println(circ2);
    System.out.println(l);

//corect List
        ArrayList <String> myList2 = new ArrayList<>();
        myList2.add("java");

     ArrayList <String> myList= new ArrayList<>();
     myList.add("alex");
     myList.add(1,"alex");
     myList2.addAll(myList2);
        System.out.println(myList.size());
        //myList.remove(2);

    //Iterator
    Iterator it = myList.iterator();
        while (it.hasNext()) {
            System.out.println((String)it.next());
        }

    ArrayList<Circle> circleList= new ArrayList<>();
        circleList.add(new Circle(7));
        for (Circle c : circleList) {c.printCircle();}


    //Hash Maps - implements map
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("alex");
        hashSet1.add("alex");//will not be added since it is duplicate
        System.out.println(hashSet1.size());

        hashSet1.addAll(myList);;
        Utils.printList(hashSet1);


        HashMap<Integer,String> myHashmap = new HashMap<>();
        myHashmap.put(1,"alex");
        myHashmap.put(2,"java");
        myHashmap.put(3,"intellij");
        Utils.printMap(myHashmap);

//How many times each letter appears in a text
  String text= "Ana are mere si pere si caise si coacaze. Este sezonul, deci vor fi foarte gustoase!";
Utils.printMap(Utils.countCharsInText(text));

        System.out.println(Browsers.SAFARI);


    }

}
