class Author {
    private String firstName;
    public  Author (String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
public class Book {
    private String title;
    private int ageOfRelyease;

    public Book(String title, int ageOfRelyease) {
        this.title = title;
        this.ageOfRelyease = ageOfRelyease;
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

