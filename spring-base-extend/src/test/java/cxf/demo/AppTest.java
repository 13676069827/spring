package cxf.demo;

import cxf.demo.source.AppConfig;
import cxf.demo.source.autowired.A;
import cxf.demo.source.autowired.B;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cxf
 * @create 2019-11-28 20:51
 * @desc
 **/
public class AppTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
