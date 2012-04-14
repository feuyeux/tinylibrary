package creative.fire.jsfrf.tinylibrary;

import java.util.ArrayList;
import java.util.List;

import creative.fire.jsfrf.tinylibrary.model.Book;

public class TinyBooks {
	private static List<Book> bookList;

	static {
		bookList = new ArrayList<Book>();

		bookList.add(new Book("978-0071625098", "JavaServer-Faces-2-0-Complete-Reference", "JavaServerFaces2TheCompleteReference.png",
				"http://www.amazon.com/JavaServer-Faces-2-0-Complete-Reference/dp/0071625097/ref=pd_sim_b_1", "JSF2 完全参考手册", "Ed Burns,Chris Schalk"));
		bookList.add(new Book("1", "JavaServer™ Faces Specification Version 2.1", "JavaServerFacesSpecification2.1.png",
				"https://javaserverfaces-spec-public.dev.java.net", "JSR314 规范", "Ed Burns, Roger Kitain"));
		bookList.add(new Book("978-0137012893", "Core JavaServer Faces (3rd Edition)", "CoreJavaServerFaces3rdEdition.png",
				"http://www.amazon.com/Core-JavaServer-Faces-3rd-Edition/dp/0137012896/ref=pd_bxgy_b_img_b", "JSF2 核心 第3版", "David Geary, Cay S. Horstmann"));
		bookList.add(new Book("978-1847199522", "JSF 2.0 Cookbook", "JSF2Cookbook.png",
				"http://www.amazon.com/JSF-2-0-Cookbook-Anghel-Leonard/dp/1847199526/ref=pd_sim_b_2", "JSF2 食谱", "Anghel Leonard"));

		bookList.add(new Book("2", "Developer Guide Develop applications using RichFaces 4", "RichFacesDeveloperGuide.png", "http://docs.jboss.org/richfaces/",
				"RichFaces开发者文档", "Brian Leathem, Lukas Fryc, and Sean Rogers"));
		bookList.add(new Book("3", "Component Reference A reference guide to the components of the RichFaces 4 framework", "JSF2Cookbook.png",
				"http://docs.jboss.org/richfaces/", "RichFaces组件参考手册", "Brian Leathem, Lukas Fryc, and Sean Rogers"));
		bookList.add(new Book("978-1430234494", "Practical RichFaces 2rd", "PracticalRichFaces2ndEdition.png",
				"http://www.amazon.com/Practical-RichFaces-Max-Katz/dp/1430234490/ref=pd_rhf_se_p_t_1", "RichFaces 实战 第2版", "Max Katz, Ilya Shaikovsky"));
	}

	public static List<Book> getBookList() {
		return bookList;
	}
}
