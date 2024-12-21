public class Main {
    public static void main(String[] args) {
        Author author = new Author("Evgeniy", "Nevedov");
        Author author1 = new Author("Vladimir", "Kuzmin");

        Book book = new Book("Georgia", author, 1938);
        Book book1 = new Book("Catch me", author1, 1998);

        System.out.println(book);
        System.out.println(book1);

        book.setPublishingYear(1941);
        System.out.println(book);
    }
}