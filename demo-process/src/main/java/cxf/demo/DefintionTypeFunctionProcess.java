package cxf.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cxf
 * @create 2019-11-24 13:24
 * @desc
 **/
//@Component
public class DefintionTypeFunctionProcess extends TypeFunctionProcess {

	public DefintionTypeFunctionProcess(String processName) {
		super(processName);
	}

	@Override
	public void doCommonProcess(Object o, ProcessInfo info) {
		System.out.println(info.getProcessName());
		System.out.println("=========== do business =============");
		System.out.println(info.getAttribute("QUOTA_TYPE"));
	}

	@Override
	public List<ProcessInfo> needDefineInfoList() {
		List<ProcessInfo> processInfos = new ArrayList<>();
		ProcessInfo e = new ProcessInfo();
		e.setProcessName("quotaA");
		e.putAttribute("QUOTA_TYPE", "A");

		ProcessInfo e1 = new ProcessInfo();
		e1.setProcessName("quotaB");
		e1.putAttribute("QUOTA_TYPE", "B");

		processInfos.add(e);
		processInfos.add(e1);
		return processInfos;
	}
}
