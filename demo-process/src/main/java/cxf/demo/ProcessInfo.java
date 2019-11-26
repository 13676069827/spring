package cxf.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cxf
 * @create 2019-11-24 12:31
 * @desc
 **/
public class ProcessInfo {
	private String processName;

	private Map<String, String> processAttributeMap = new HashMap<>();

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public void putAttribute(String key, String val) {
		processAttributeMap.put(key, val);
	}

	public String getAttribute(String key) {
		return processAttributeMap.get(key);
	}

	@Override
	public String toString() {
		return "ProcessInfo{" +
				"processName='" + processName + '\'' +
				", processAttributeMap=" + processAttributeMap +
				'}';
	}
}
