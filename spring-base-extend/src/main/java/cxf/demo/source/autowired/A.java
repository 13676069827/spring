package cxf.demo.source.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author cxf
 * @create 2019-11-28 20:50
 * @desc
 **/
@Component
public class A {

	@Autowired
	private List<B> bList;

	private B setB(B b) {
		System.out.println(b);
		return b;
	}
}
