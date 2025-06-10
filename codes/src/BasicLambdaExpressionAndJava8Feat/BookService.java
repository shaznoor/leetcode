package BasicLambdaExpressionAndJava8Feat;

import java.util.Collections;
import java.util.List;

public class BookService {
    public List<Book> getBooksInSort(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        //Collections.sort(books, Comparator.comparing(Book::getName));
        //Collections.sort(books, new MyComparator());
        return books;
    }

    public static void main(String[] args) {
        BookService bookService = new BookService();
        List<Book> bookList = bookService.getBooksInSort();
        System.out.println(bookList);
    }
}

/*class MyComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}*/
