public class Book {
    String name;
    String lastName;
    int date;
    String bookName;






    public Book(String name, String lastName,String bookName, int date) {
        this.name = name;
        this.lastName = lastName;
        this.bookName = bookName;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
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


