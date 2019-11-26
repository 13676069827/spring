package cxf.demo.merged;

/**
 * @author cxf
 * @create 2019-11-12 20:57
 * @desc
 **/
public class Child {

	private String type;

	private String name;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Child{" +
				"type='" + type + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
