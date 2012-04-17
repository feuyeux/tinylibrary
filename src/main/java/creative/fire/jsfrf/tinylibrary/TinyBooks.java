package creative.fire.jsfrf.tinylibrary;

import java.util.ArrayList;
import java.util.List;

import creative.fire.jsfrf.tinylibrary.model.Book;

public class TinyBooks {
	private static List<Book> bookList;

	static {
		bookList = new ArrayList<Book>();

		bookList.add(new Book("978-0071625098", "JavaServer-Faces-2-0-Complete-Reference", "JSF2 Complete Reference",
				"JavaServerFaces2TheCompleteReference.png", "http://www.amazon.com/JavaServer-Faces-2-0-Complete-Reference/dp/0071625097", "JSF2 完全参考手册",
				"Ed Burns,Chris Schalk"));

		bookList.add(new Book("1", "JavaServer™ Faces Specification Version 2.1", "JSR314", "JavaServerFacesSpecification2.1.png",
				"https://javaserverfaces-spec-public.dev.java.net", "JSR314 规范", "Ed Burns, Roger Kitain"));

		bookList.add(new Book("978-0137012893", "Core JavaServer Faces (3rd Edition)", "Core JSF", "CoreJavaServerFaces3rdEdition.png",
				"http://www.amazon.com/Core-JavaServer-Faces-3rd-Edition/dp/0137012896", "JSF2 核心 第3版", "David Geary, Cay S. Horstmann"));

		bookList.add(new Book("978-1847199522", "JSF 2.0 Cookbook", "JSF2 Cookbook", "JSF2Cookbook.png",
				"http://www.amazon.com/JSF-2-0-Cookbook-Anghel-Leonard/dp/1847199526", "JSF2 食谱", "Anghel Leonard"));

		bookList.add(new Book("2", "Developer Guide Develop applications using RichFaces 4", "RichFaces4 Developer Guide", "RichFacesDeveloperGuide.png",
				"http://docs.jboss.org/richfaces/", "RichFaces开发者文档", "Brian Leathem, Lukas Fryc, and Sean Rogers"));

		bookList.add(new Book("3", "Component Reference A reference guide to the components of the RichFaces 4 framework", "RichFaces4 Component Reference",
				"RichFacesComponentReference.png", "http://docs.jboss.org/richfaces/", "RichFaces组件参考手册", "Brian Leathem, Lukas Fryc, and Sean Rogers"));

		bookList.add(new Book("978-1430234494", "Practical RichFaces 2rd", "Practical RichFaces 2", "PracticalRichFaces2ndEdition.png",
				"http://www.amazon.com/Practical-RichFaces-Max-Katz/dp/1430234490", "RichFaces 实战 第2版", "Max Katz, Ilya Shaikovsky"));

		bookList.add(new Book("978-1935182320", "jQuery in Action, Second Edition", "jQuery in Action 2", "jQueryinActionSecondEdition.png",
				"http://www.amazon.com/jQuery-Action-Second-Edition-Bibeault/dp/1935182323", "jQuery实战 第2版", "Bear Bibeault, Yehuda Katz"));

		bookList.add(new Book("978-0596522049", "Java Message Service, Second Edition", "JMS 2", "JavaMessageService.png",
				"http://www.amazon.com/Java-Message-Service-Mark-Richards/dp/0596522045", "JMS2 权威指南", "Mark Richards, Richard Monson-Haefel, David A Chappell"));
	}

	public static List<Book> getBookList() {
		return bookList;
	}

	public static Book getBook(String bookId) {
		for (Book book : bookList) {
			if (book.getId().equals(bookId))
				return book;
		}
		return null;
	}
}
