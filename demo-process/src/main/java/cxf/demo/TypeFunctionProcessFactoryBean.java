package cxf.demo;

import org.springframework.beans.factory.FactoryBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author cxf
 * @create 2019-11-24 12:41
 * @desc
 **/
public class TypeFunctionProcessFactoryBean implements FactoryBean {

	private String processName;

	private Map processAttributMap;

	@Override
	public Object getObject() throws Exception {
		return this;
	}

	@Override
	public Class<?> getObjectType() {
		return Process.class;
	}
}
