package com.binarytweed.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines prefix patterns which {@code QuarantiningUrlClassLoader} will load 
 * in a separate ClassLoader. 
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Quarantine
{
	/**
	 * 
	 * @return prefix patterns which {@code QuarantiningUrlClassLoader} will load in a separate ClassLoader
	 */
	public String[] value() default {};
	
	
	/**
	 * 
	 * @return whether the annotated test class and the runner used should also be quarantined.
	 */
	public boolean quarantineTestAndRunner() default true;
}
