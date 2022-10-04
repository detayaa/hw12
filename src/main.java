public class main {
    public static void main(String[] args) {
        Author author = new Author ("Fedor","Dostoevsky");
        Book book = new Book(author,"Crime and Punishment",1239);





        System.out.println("book.getAuthor() = " + book.getAuthor());
        System.out.println("book.getBookName() = " + book.getBookName());
        System.out.println("book.getDate() = " + book.getDate());

        book.setDate(1990);
        System.out.println("book.getDate() = " + book.getDate());




        Author author1 = new Author("Micael", "Lermontov");
        Book book1 = new Book(author1, "Hero of our time", 1893);

        System.out.println("book2.nameAuthor1 = " + book1.getAuthor());
        System.out.println("book2.name1 = " + book1.getBookName());
        System.out.println("book2.date1 = " + book1.getDate());


        Author author2 = new Author("Nikolay", "Gogol'");
        Book book2 = new Book(author2,"Dead Souls", 1987);

        System.out.println("book3.lastNameAuthor2 = " + book2.getAuthor());
        System.out.println("book3.name2 = " + book2.getBookName());
        System.out.println("book3.date2 = " + book2.getDate());

        book2.setDate(1990);
        System.out.println("book3.date2 = " + book2.getDate());




    }
}
