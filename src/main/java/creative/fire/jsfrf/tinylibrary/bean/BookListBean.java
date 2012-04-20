package creative.fire.jsfrf.tinylibrary.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.richfaces.event.DropEvent;

import creative.fire.jsfrf.tinylibrary.TinyBooks;
import creative.fire.jsfrf.tinylibrary.model.Book;
/**
 * @author feuyeux@gmail.com
 * @version 1.0
 */
@ManagedBean(name = "listBean")
@ViewScoped
public class BookListBean implements Serializable {
	private static final long serialVersionUID = 4802531802901782798L;
	private List<Book> books;
	private List<Book> borrowbooks;

	public BookListBean() {
		books = TinyBooks.getBookList();
	}

	public List<Book> getBooks() {
		return books;
	}

	public List<Book> getBorrowbooks() {
		return borrowbooks;
	}

	public void borrow(DropEvent event) {
		Book dragged = (Book) event.getDragValue();
		if (borrowbooks == null)
			borrowbooks = new ArrayList<Book>();
		borrowbooks.add(dragged);
	}
}
