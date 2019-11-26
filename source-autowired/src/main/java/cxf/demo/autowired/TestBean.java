package cxf.demo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author cxf
 * @create 2019-11-26 20:34
 * @desc
 **/
@Component
public class TestBean {

	@Autowired
	private AutowiredBean autowiredBean;
	
}
