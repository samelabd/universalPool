package oracle.test.universalpool;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(TestAnnotation.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface XAnnotation {

	String word() default  "xxxx";
	
	int value();
	
}
