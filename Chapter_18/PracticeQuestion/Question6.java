public class Question6 {
    public static void main(String[] args) {
        System.out.println(Book.cnt);
        Book b1=new Book("OOPs");
        Book b2=new Book("COA");
        System.out.println(Book.cnt);
        System.out.println(b1.name);
        System.out.println(b2.name);
    }
}

class Book {
    String name;
    static int cnt;

    public Book(String name) {
        this.name = name;
        cnt++;
    }
}
