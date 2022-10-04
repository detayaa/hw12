public class Author {
    private final String name;
    private final String lastName;

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

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author name = (Author) other;
        return equals(name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
