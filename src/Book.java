
public class Book {
    private String title;
    private int ageOfRelyease;
    private Author author;

    public Book(String title, int ageOfRelyease, Author author) {
        this.title = title;
        this.ageOfRelyease = ageOfRelyease;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public Book(String title, int ageOfRelyease) {
        this(title, ageOfRelyease, null);
    }

    public String getTitle() {
        return title;
    }
    public int getAgeOfRelyease() {
        return ageOfRelyease;
    }

    public void setAgeOfRelease(int ageOfRelyease) {
        this.ageOfRelyease = ageOfRelyease;
    }

}

