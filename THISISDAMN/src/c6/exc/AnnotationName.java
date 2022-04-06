package c6.exc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationName {
	
	String eN1();
	int eN2() default 5;

}

//타겟 정해주고, 유지정책 확인해줘라 어노테이션 선언할 때