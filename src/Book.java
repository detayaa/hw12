public class Book {
    public int date;
    public String bookName;







    public Book(String bookName, int date) {

        this.bookName = bookName;
        this.date = date;
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


