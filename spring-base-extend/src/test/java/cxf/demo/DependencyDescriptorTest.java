package cxf.demo;

import cxf.demo.source.autowired.A;
import cxf.demo.source.autowired.B;
import org.junit.Test;
import org.springframework.beans.factory.config.DependencyDescriptor;
import org.springframework.core.MethodParameter;
import org.springframework.core.ResolvableType;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author cxf
 * @create 2019-11-28 21:09
 * @desc
 **/
public class DependencyDescriptorTest {
	@Test
	public void testDependencyDescriptorField() throws NoSuchFieldException {
		Field field = A.class.getDeclaredField("bList");
		DependencyDescriptor dependencyDescriptor = new DependencyDescriptor(field, true);
		ResolvableType resolvableType = dependencyDescriptor.getResolvableType();
		System.out.println(resolvableType);
		System.out.println(resolvableType.asCollection().resolveGeneric());
	}

	@Test
	public void testDependencyDescriptorMethod() throws NoSuchFieldException, NoSuchMethodException {
		Method method = A.class.getDeclaredMethod("setB", B.class);
		MethodParameter methodParameter = new MethodParameter(method, 0);
		DependencyDescriptor dependencyDescriptor = new DependencyDescriptor(methodParameter, true);
		Class<?> dependencyType = dependencyDescriptor.getDependencyType();
		ResolvableType resolvableType = dependencyDescriptor.getResolvableType();
	}

}
