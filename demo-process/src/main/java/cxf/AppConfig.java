package cxf;

import cxf.demo.TypeFunctionProcessBeanDefintionRegistryPostProcessor;
import cxf.demo.second.ProcessBeanDefintionRegistryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author cxf
 * @create 2019-11-24 13:07
 * @desc
 **/
@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	public ProcessBeanDefintionRegistryPostProcessor processBeanDefintionRegistryPostProcessor() {
		return new ProcessBeanDefintionRegistryPostProcessor();
	}
}
