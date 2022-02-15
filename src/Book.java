import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int rok;

    public Book(String title, String author, String publisher, int rok) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.rok = rok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return rok == book.rok && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", rok=" + rok +
                '}';
    }
}
