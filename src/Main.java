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

        Author newAuthor = new Author("Vladimir", "Kuzmin");
        System.out.println("Author1 равен newAuthor: " + author1.equals(newAuthor));

        Book newBook = new Book("Catch me", newAuthor, 1998);
        System.out.println("Book1 равна newBook: " + book1.equals(newBook));

        System.out.println("HashCode author1: " + author1.hashCode());
        System.out.println("HashCode newAuthor: " + newAuthor.hashCode());
        System.out.println("HashCode book1: " + book1.hashCode());
        System.out.println("HashCode newBook: " + newBook.hashCode());
    }
}