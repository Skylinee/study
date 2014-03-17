package com.louis.april;
public class RecursionTest {
	public static void main(String arg[]) {
		System.out.println(f(-9));
	}
//用递归	
/*	public static long f(int n) {
		if (n == 1 || n==2)
			return 1;
		else 
			return f(n-1)+f(n-2);		
	}*/
//用循环
	public static long f(int n){
		if (n < 0){
			System.out.println("输入值不能为负值！");
		}
		
		
		if (n == 1 || n == 2){
				return 1;
		}		
		
		long f1 = 1L;
		long f2 = 1L;
		long f  = 0;
		
		for(int i=0;i<n-2;i++){
			f  = f1 + f2;
			f1 = f2;
			f2 = f;
		}
		return f;
		
	}
}
