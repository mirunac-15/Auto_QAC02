package homeworks.java.oop1;

public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("Jack London", "Libraria@email.com");
        Author author2 = new Author("Mircea Eliade", "Libraria@email.com");

        Book book1 = new Book("Colt alb", 1906, author1, 50);
        Book book2 = new Book("Maitreyi", 1933, author2, 35);


        System.out.println(book1.scriecarte());
        System.out.println(book2.scriecarte());





    }

}