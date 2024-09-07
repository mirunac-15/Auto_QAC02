package courses.java.oop2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Utils {
    //static method
    public static void printCircleStatic(Circle c) {
        System.out.println("color = " + c.getColor());
        System.out.println("vertices = " + c.getVertices());
        System.out.println("radius = " + c.getVertices());
        System.out.println("-------------");
    }

    public static void printList(Collection c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }

    public static void printMap(Map m) {
        for (Object o : m.keySet()) {
            System.out.println("Key" + o + " Value: " + m.get(o));
        }
    }
    //How many times each letter appears in a text
    public static HashMap<Character, Integer> countCharsInText(String text) {
        HashMap<Character, Integer> charMap = new HashMap();
        for (char c : text.toCharArray()) {
            if (charMap.keySet().contains(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
            return charMap;
        }
    }




