package com.louis.april;
public class IfTest{
	public static void main(String[] args){
		long f = 1;
		long result = 1;
		for(int i=1;i<=10;i++){
			f = f*i;
			result += f;
		}
		
		System.out.print(result);
	}
}