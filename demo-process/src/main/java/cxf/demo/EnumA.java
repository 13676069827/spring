package cxf.demo;

/**
 * @author cxf
 * @create 2019-11-24 13:48
 * @desc
 **/
public enum EnumA {
	A("A");
	private String code;

	EnumA(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
