package br.fam.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CRUDName {
	String nome();
	boolean insert() default false;
	boolean update() default false;
	boolean delete() default false;
	boolean search() default false;
}
