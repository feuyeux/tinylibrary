package creative.fire.jsfrf.tinylibrary;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * @author feuyeux@gmail.com
 * @version 1.0
 */
@ManagedBean(name = "reception")
@RequestScoped
public class TinyReception {
	@ManagedProperty(value="尹天仇")
	private String name;

	public TinyReception() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}