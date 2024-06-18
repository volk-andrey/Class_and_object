public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев","Толстой");
        Author author2  = new Author("Джэйн","Остин");

        Book book1 = new Book("Война и Мир",author1,1869);
        Book book2 = new Book("Гордость и предубеждение", author2, 1813);

        System.out.println("Название книги: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год пуликации: " + book1.getYearPublished());
        System.out.println("\nНазвание книги: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год пуликации: " + book2.getYearPublished());
        book1.setYearPublished(1873);
        System.out.println("\nИзменение года публикации book1: " + book1.getYearPublished());
    }
}