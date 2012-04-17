package creative.fire.jsfrf.tinylibrary.model;

import java.io.Serializable;

public class Book implements Serializable {
	private static final long serialVersionUID = 1874850709098419575L;
	private String id;
	private String name;
	private String alias;
	private String image;
	private String url;
	private String desc;
	private String author;

	public Book(String id, String name, String alias, String image, String url, String desc, String author) {
		super();
		this.id = id;
		this.name = name;
		this.alias = alias;
		this.image = image;
		this.url = url;
		this.desc = desc;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return id + "-" + name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (obj.getClass() != getClass())
			return false;
		return ((Book) obj).id.equals(id);
	}

	@Override
	public int hashCode() {
		return id.hashCode() * 31;
	}
}
