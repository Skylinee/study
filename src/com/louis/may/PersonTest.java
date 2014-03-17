package com.louis.may;

import java.awt.image.SampleModel;

class Person{
	//��Ա����
	private int id;
	private int age = 20;
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void  setAge(int i) {
		age = i;
	}
	public int getid(){
		return id;
	}
	public String getInfo(){
		return "Name:" + name + "\n" + "age:" + age;
	}

	
}

class Student extends Person{

	private String school;
		
}

public class PersonTest{
	public static void main(String args[]){
		Student Tom = new Student();
		Student jim = new Student();
		jim.setAge(199);
		Tom.setName("sam");
		
	}
}