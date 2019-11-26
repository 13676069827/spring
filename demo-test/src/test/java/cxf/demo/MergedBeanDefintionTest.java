package cxf.demo;

import cxf.demo.merged.Child;
import cxf.demo.merged.Root;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cxf
 * @create 2019-11-10 15:11
 * @desc
 **/
public class MergedBeanDefintionTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
		rootBeanDefinition.getPropertyValues().add("type", "A");
		rootBeanDefinition.getPropertyValues().add("name", "B");
		rootBeanDefinition.setBeanClass(Root.class);

		GenericBeanDefinition child = new GenericBeanDefinition();
		child.setBeanClass(Child.class);
		child.setParentName("root");
		child.getPropertyValues().add("name", "C");


		applicationContext.registerBeanDefinition("root", rootBeanDefinition);
		applicationContext.registerBeanDefinition("child", child);
		System.out.println(applicationContext.getBean(Child.class));
	}
}
