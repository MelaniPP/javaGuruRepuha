package Book;

public class Main {
    public static void main(String[] args) {
        Book a = new Book();
        Book b = new Book();
        Book c = new Book();

        a.setAuthor("Igors");
        a.setYear(1999);
        a.setQnt(100500);

        b.setAuthor("Uasja");
        b.setYear(1925);
        b.setQnt(350);

        c.setAuthor("Petja");
        c.setYear(2009);
        c.setQnt(2);

        a.getYear();
        a.getQnt();
        a.getAuthor();

        b.razdeljalka();

        b.getYear();
        b.getQnt();
        b.getAuthor();

        c.razdeljalka();

        c.getYear();
        c.getQnt();
        c.getAuthor();


    }
}
