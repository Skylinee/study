package com.louis.may;

import java.util.jar.Attributes.Name;

class Teacher extends Person{
	private String  school;
	
	public String getSchool(){
		return school;		
	}
	
	public void setSchool(String school){
		this.school = school;
	}
	
	public String getInfo(){
		return "Name:" + getName() + "\n" + "Age:" + getAge() + "\n" + "School:" + school;
	}
}
public class TestOverWrite {
	 public static void main(String arg[]){
		 Teacher teacher = new Teacher();
		 Person person = new Person();
		 person.setAge(500);
		 person.setName("none");
		 teacher.setAge(32);
		 teacher.setName("July");
		 person.getInfo();
		 teacher.getInfo();
	 }

}
