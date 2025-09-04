//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book bushido = new Book("bushido", 1900);
        bushido.setAgeOfRelease(1990);
        Author bushido1 = new Author("Inoji", "Nitobe");
        Book sauces = new Book("Sauces", 2021);
        Author sauces1 = new Author("Tom", "Filler");

        System.out.println(bushido.getAgeOfRelyease());
    }
}