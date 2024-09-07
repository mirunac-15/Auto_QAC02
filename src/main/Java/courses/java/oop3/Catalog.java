package courses.java.oop3;

import java.util.Comparator;
import java.util.HashMap;

public class Catalog {
    HashMap<String, Double> students;

    public Catalog (HashMap<String,Double> students){
        this.students = students;
    }
    public Catalog() {
        this.students= new HashMap<>();
    }
    public void printStudents(){
        for (String student : students.keySet()){
            System.out.println("- student : "+ student);
            System.out.println("- Grade : "+ students.get(student));
        }
    }
    public void addStudent (String name, Double grade) {
        if (students.containsKey("name")){
            System.out.println(" student already exist ! ");
        } else {
            if (grade >= 0 || grade <= 10)
                students.put(name, grade);
            else
                System.out.println("Grade must be between 0 and 10");
         }
        }

   public boolean searchStudent(String name) {
       if (students.containsKey(name)) {
           System.out.println(" student : " + name + " is found !");
           System.out.println("- Grade : " + students.get(name));
           return true;
       } else {
           System.out.println(" student {} does not apppear registered in the catalog" + name);
           return false;
       }
   }
   public void deleteStudent(String name){
        if (searchStudent(name)){
            students.remove(name);
            System.out.println(" student " + name + " has been deleted !");
        }
   }


}
