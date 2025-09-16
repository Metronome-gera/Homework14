class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class Book {
    private String title;
    private int ageOfRelyease;
    private Author author;

    public Book(String title, int ageOfRelyease, Author author) {
        this.title = title;
        this.ageOfRelyease = ageOfRelyease;
        this.author = author;
    }

    public Book(String bushido, int ageOfRelyease) {
    }

    public String getTitle() {
        return title;
    }

    public int getAgeOfRelyease() {
        return ageOfRelyease;
    }
    public Author getAuthor() {
        return author;
    }

    public void setAgeOfRelease(int ageOfRelyease) {
        this.ageOfRelyease = ageOfRelyease;

        
    }
}

