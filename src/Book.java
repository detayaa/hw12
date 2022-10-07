public class Book {
    private final Author author;
    private int date;
    private final String bookName;

    @Override
    public String toString() {
        return "Book{" +
                  author +
                ", date=" + date +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    public Book(Author author, String bookName, int date) {
        this.author = author;
        this.bookName = bookName;
        this.date = date;
    }

    public Author getAuthor() {
        return this.author;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }


}


