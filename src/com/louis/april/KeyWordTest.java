package com.louis.april;
class Leaf {
	int i;
	Leaf(int i){this.i = i;}
	Leaf increament(){
		i++;
		return this;
	}	
	void print(){System.out.println("i = " + i);}
}

public class KeyWordTest{
	public static void main(String arg[]){
		Leaf leaf = new Leaf(100);
		leaf.increament().increament().print();
	}
}
