package cxf.demo.second;

import cxf.demo.TypeFunctionProcessFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;

import java.util.HashMap;

/**
 * @author cxf
 * @create 2019-11-24 13:15
 * @desc
 **/
public class ProcessBeanDefintionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		GenericBeanDefinition aBeanDefinition = new GenericBeanDefinition();
		aBeanDefinition.setBeanClass(ADefintionProcess.class);
		aBeanDefinition.getPropertyValues().add("processName", "quotaA");
		HashMap<String, String> processAttributeMap = new HashMap<>();
		processAttributeMap.put("QUOTA_TYPE", "A");
		aBeanDefinition.getPropertyValues().add("processAttributeMap", processAttributeMap);
		registry.registerBeanDefinition("quotaA", aBeanDefinition);
		

		GenericBeanDefinition bBeanDefinition = new GenericBeanDefinition();
		bBeanDefinition.setBeanClass(ADefintionProcess.class);
		bBeanDefinition.getPropertyValues().add("processName", "quotaB");
		HashMap<String, String> processAttributeMapB = new HashMap<>();
		processAttributeMapB.put("QUOTA_TYPE", "B");
		bBeanDefinition.getPropertyValues().add("processAttributeMap", processAttributeMapB);
		registry.registerBeanDefinition("quotaB", bBeanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
