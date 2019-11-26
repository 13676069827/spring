package cxf.demo.second;

/**
 * @author cxf
 * @create 2019-11-24 13:53
 * @desc
 **/
public class ADefintionProcess extends AbstractDefintionProcess {
	
	@Override
	public void process(Object o) {
		System.out.println(getProcessName() + " : ");
		System.out.println("QUOTA_TYPE : " + getAttribute("QUOTA_TYPE"));
	}
}
