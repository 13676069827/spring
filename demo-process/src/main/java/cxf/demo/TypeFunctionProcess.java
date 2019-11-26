package cxf.demo;

import java.util.List;

/**
 * @author cxf
 * @create 2019-11-24 12:29
 * @desc
 **/
public abstract class TypeFunctionProcess implements Process {

	private String processName;

	public TypeFunctionProcess(String processName) {
		this.processName = processName;
	}

	abstract void doCommonProcess(Object o, ProcessInfo info);

	abstract List<ProcessInfo> needDefineInfoList();

	@Override
	public void process(Object o) {
		// next can judge by processName
		ProcessInfo executeInfo = null;
		List<ProcessInfo> processInfos = needDefineInfoList();
		for (ProcessInfo processInfo : processInfos) {
			if (processInfo.getProcessName().equals(processName)) {
				executeInfo = processInfo;
				break;
			}
		}

		doCommonProcess(o, executeInfo);
	}
}
