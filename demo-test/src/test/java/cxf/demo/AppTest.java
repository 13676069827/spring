package cxf.demo;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cxf
 * @create 2019-11-10 15:11
 * @desc
 **/
public class AppTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		BeanDefinition beanDefinition = applicationContext.getBeanDefinition("appConfig");
		System.out.println(beanDefinition);
	}
}
