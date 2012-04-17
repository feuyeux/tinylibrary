package creative.fire.jsfrf.tinylibrary.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import creative.fire.jsfrf.tinylibrary.TinyBooks;
import creative.fire.jsfrf.tinylibrary.model.Book;

@ManagedBean(name = "listBean")
@ViewScoped
public class BookListBean {
	private List<Book> books;

	public BookListBean() {
		books = TinyBooks.getBookList();
	}

	public List<Book> getBooks() {
		return books;
	}
}
