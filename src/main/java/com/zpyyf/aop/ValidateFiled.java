package com.zpyyf.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ValidateFiled {

	/**
	 * ��������λ��
	 */
	int index() default -1 ;

	/**
	 * ��������ǻ����������ͻ�String ���Ͳ���ָ���ò�������������Ƕ���Ҫ��֤��������ĳ�����ԣ����øò���ָ��������
	 */
	String filedName() default "" ;

	/**
	 * ������֤
	 */
	String regStr() default "";

	/**
	 * �Ƿ���Ϊ��  �� Ϊtrue��ʾ����Ϊ�� �� false��ʾ�ܹ�Ϊ��
	 */
	boolean notNull() default false;

	/**
	 * �Ƿ���Ϊ��  �� Ϊtrue��ʾ����Ϊ�� �� false��ʾ�ܹ�Ϊ��
	 */
	int maxLen() default -1 ;

	/**
	 * ��С���� �� �û���֤�ַ���
	 */
	int minLen() default -1 ;

	/**
	 *���ֵ ��������֤������������
	 */
	int maxVal() default -1 ;

	/**
	 *��Сֵ ��������֤��ֵ��������
	 */
	int minVal() default -1 ;

}
