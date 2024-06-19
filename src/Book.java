import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yearPublished;

    public Book(String title, Author author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }
    public Author getAuthor()  {
        return author;
    }
    public int getYearPublished()  {
        return yearPublished;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString(){
        return "Название книги: " + getTitle() + ", " + getAuthor() + ", Год публикации: " + getYearPublished();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublished);
    }
}
