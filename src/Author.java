public class Author {
    String name;
    String lastName;

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Author (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }



}
