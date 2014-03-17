package com.louis.april;
class Birthday{
	private int day;
	private int month;
	private int year;
	
	public Birthday(int d, int m, int y){
		day = d;
		month = m;
		year = y;
		
	}
	
	public void setDay(int d){
		day = d;
	}
	
	public void setMonth(int m){
		month = m;
	}
	
	public void setYear(int y){
		year = y;
	}
	
	public void display(){
		System.out.println(day + "-" + month + "-" + year);
	}
}

public class BirthdayTest {
	public static void main(String args[]){
		BirthdayTest test = new BirthdayTest();
		int date = 9;
		Birthday b1 = new Birthday(1,1,2012);
		Birthday b2 = new Birthday(14,1,1989);
		test.change1(date);
		test.change2(b1);
		test.change3(b2);
		System.out.println("date=" + date);
		b1.display();
		b2.display();
	}
	//这里定义的i是形参，b1调用这个方法时，date值赋给i，方法执行后i赋�?1234，执行完后，i的�?�?234，date的�?不变
	public void change1(int i){
		i = 1234;		
	}
	//b是一个局部变量，当b2调用这个方法时，将地�?��给b，b和b2指向同一对象，执行完后，b的指向新对象，b的内存消失，b指向的新对象也被回收；b2的�?不变
	public void change2(Birthday b){
		b = new Birthday(22,4,2013);
	}
	//
	public void change3(Birthday b){
		b.setDay(22);
		b.setMonth(4);
		b.setYear(2013);
	}
	
}
