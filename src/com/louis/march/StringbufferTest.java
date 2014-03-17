package com.louis.march;

/**
 * @author louis 
 * @data 2014-03-15
 */
public class StringbufferTest {
	public static void main(String args[]) {
		String s1 = "JAVA";
		String s2 = "Everyday";
		String s3 = "Learn";
		StringBuffer sb1 = new StringBuffer(s3);
		sb1.append(" ").append(s1).append(" ").append(s2);
		System.out.println(sb1);
		
		for (int i = 0; i < 10; i++) {
			sb1.append(i);
		}
		System.out.println(sb1);
	}
}
