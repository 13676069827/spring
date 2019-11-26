import cxf.AppConfig;
import cxf.demo.Process;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cxf
 * @create 2019-11-24 13:11
 * @desc
 **/
public class ProcessInSpringTest {

	@Test
	public void testProcess() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Process quotaB = (Process) annotationConfigApplicationContext.getBean("quotaB");
		quotaB.process(new Object());
	}
}
