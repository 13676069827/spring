package cxf.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author cxf
 * @create 2019-11-28 20:14
 * @desc
 **/

public interface StringCallBack {
	   void callback(String x);
}
