public class main {
    public static void main(String[] args) {

        Book book = new Book("Crime and Punishment",1866);
        Author author = new Author("Fedor","Dostoevsky");
        // задание 2


        // задание 4
        System.out.println("author.getName() = " + author.getName());
        System.out.println("author.getLastName() = " + author.getLastName());
        System.out.println("book.getBookName() = " + book.getBookName());
        System.out.println("book.getDate() = " + book.getDate());

        // задание 5
        book.setDate(1990);
        System.out.println("book.getDate() = " + book.getDate());

        // задание 6
        Book2 book2 = new Book2("Michael", "Lermontov", "Hero of our time", 1893);
        System.out.println("book2.nameAuthor1 = " + book2.nameAuthor1);
        System.out.println("book2.lastNameAuthor1 = " + book2.lastNameAuthor1);
        System.out.println("book2.name1 = " + book2.name1);
        System.out.println("book2.date1 = " + book2.date1);

        Book3 book3 = new Book3("Nikolay", "Gogol'", "dead Souls", 1987);
        System.out.println("book3.nameAuthor2 = " + book3.nameAuthor2);
        System.out.println("book3.lastNameAuthor2 = " + book3.lastNameAuthor2);
        System.out.println("book3.name2 = " + book3.name2);
        System.out.println("book3.date2 = " + book3.date2);


        // задание 7
        book3.setDate2(1990);
        System.out.println("book3.date2 = " + book3.date2);


    }
}
