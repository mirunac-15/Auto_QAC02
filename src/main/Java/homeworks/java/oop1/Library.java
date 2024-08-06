package homeworks.java.oop1;

public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("Jack London", "Libraria@email.com");
        Author author2 = new Author("Mircea Eliade", "Libraria@email.com");

        Book book1 = new Book("Colt alb", 1906, author1, 50);
        Book book2 = new Book("Maitreyi", 1933, author2, 35);


        System.out.println("Book 1: " + book1.getName() + " are pretul " + book1.getPrice() + " de RON, este scrisa de autorul " + author1.getName() + " si a fost publicata in anul " + book1.getYear() + ".");
        System.out.println("Book 2: " + book2.getName() + " are pretul " + book2.getPrice() + " de RON, este scrisa de autorul " + author2.getName() + " si a fost publicata in anul " + book2.getYear() + ".");



    }

}