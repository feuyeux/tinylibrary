package creative.fire.jsfrf.tinylibrary.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import creative.fire.jsfrf.tinylibrary.model.Book;

@ManagedBean(name = "bookBean")
@RequestScoped
public class BookDetailBean {
	private Book b;

	public Book getB() {
		return b;
	}

	public void insert() {

	}

	public void edit() {

	}

	public void remove() {

	}
}
