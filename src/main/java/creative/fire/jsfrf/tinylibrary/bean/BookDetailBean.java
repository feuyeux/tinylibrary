package creative.fire.jsfrf.tinylibrary.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import creative.fire.jsfrf.tinylibrary.TinyBooks;
import creative.fire.jsfrf.tinylibrary.model.Book;
/**
 * @author feuyeux@gmail.com
 * @version 1.0
 */
@ManagedBean(name = "bookBean")
@RequestScoped
public class BookDetailBean {
	private Book b;

	public Book getB() {
		return b;
	}

	public void insert() {

	}

	public String edit() {
		String bookId = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("bookId");
		b = TinyBooks.getBook(bookId);
		return "book";
	}

	public void remove() {

	}
}
