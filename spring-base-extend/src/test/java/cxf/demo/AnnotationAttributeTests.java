package cxf.demo;

import cxf.demo.annotation.CustomAnnotation;
import org.junit.Test;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationAttributes;

import java.lang.reflect.Method;

/**
 * @author cxf
 * @create 2019-11-26 22:21
 * @desc
 **/
public class AnnotationAttributeTests {

	@Test
	public void testAnnotationAttributeClass() {
		AnnotationAttributes mergedAnnotationAttributes = AnnotatedElementUtils.getMergedAnnotationAttributes(AnnotationAttributeClass.class, CustomAnnotation.class);
		System.out.println(mergedAnnotationAttributes.getString("attr"));
		System.out.println(mergedAnnotationAttributes.getBoolean("isExist"));
		System.out.println(mergedAnnotationAttributes);
	}

	@Test
	public void testAnnotationAttributeMethod() throws NoSuchMethodException {
		Method method = AnnotationAttributeClass.class.getDeclaredMethod("methodAnno");
		AnnotationAttributes mergedAnnotationAttributes = AnnotatedElementUtils.getMergedAnnotationAttributes(method, CustomAnnotation.class);
		System.out.println(mergedAnnotationAttributes);

	}
}
