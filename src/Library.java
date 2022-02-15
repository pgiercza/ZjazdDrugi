import com.sun.source.tree.LambdaExpressionTree;

public class Library {
    public static void main(String[] args) {
        Book [] books={
                new Book("Pan Tadeusz","Zbigniew","Kraków",2022),
                new Book("ddes","Zbigniew","Kraków",2022),
                new Book("ddd","Zbigniew","Kraków",2022)
        };
        Book book1=books[1];
        Book book2=books[2];

        System.out.println(book1.equals(book2));

    }
}
