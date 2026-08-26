java to edit this template
 
package b1prak713120240020.book;

/**
 *
 * @author almashafira
 */

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> findBookList();
    Book findBookById(int id);
    void updateBook(Book book);
    void removeBook(int id);
}
