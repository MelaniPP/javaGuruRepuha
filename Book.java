package Book;

public class Book {
     private String author;
     private int qnt;
     private int year;

    void setAuthor(String a) {
        author = a;

    }

    void setQnt(int q) {
        qnt = q;
    }

    void setYear(int y) {
        year = y;
    }
    void getYear (){
        System.out.println(year+" "+"year of production");
    }
    void getQnt (){
        System.out.println(qnt+" "+"quantity of pages");

    } void getAuthor(){
        System.out.println(author +" "+" is an Author");
    }
    void razdeljalka(){
        System.out.println("****************************");
    }
}

