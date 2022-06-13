import java.util.Objects;

public class Author {
    private String firstname;
    private String surname;
    public Author (String firstname, String surname)
    {
        this.firstname = firstname;
        this.surname = surname;
    }

    public String toString(){
        return "Author " + this.firstname + this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstname, author.firstname) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, surname);
    }

    public String getFirstName()
    {
        return this.firstname;
    }
    public String getSurname(){

        return this.surname;
    }
}