package cxf.demo;

import cxf.demo.annotation.CustomAnnotation;
import cxf.demo.annotation.StringCallBack;
import org.springframework.stereotype.Component;

/**
 * @author cxf
 * @create 2019-11-26 22:19
 * @desc
 **/
@CustomAnnotation(isExist = true, attr = "cls")
public class AnnotationAttributeClass {
	final static StringCallBack callback = (x) -> {
		System.out.println(x);
	};

	@CustomAnnotation(isExist = true, attr = "med")
	private void methodAnno() {}
}
