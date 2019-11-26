package cxf.demo.second;

import cxf.demo.Process;

import java.util.Map;

/**
 * @author cxf
 * @create 2019-11-24 13:50
 * @desc
 **/
public abstract class AbstractDefintionProcess implements Process {
	private String processName;

	private Map<String, String> processAttributeMap;

	public String getProcessName() {
		return processName;
	}

	public String getAttribute(String key) {
		return processAttributeMap.get(key);
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public Map<String, String> getProcessAttributeMap() {
		return processAttributeMap;
	}

	public void setProcessAttributeMap(Map<String, String> processAttributeMap) {
		this.processAttributeMap = processAttributeMap;
	}
}
