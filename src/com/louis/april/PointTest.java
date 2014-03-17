package com.louis.april;

class Point{
	 double x;
	 double y;
	 double z;
	
	 Point(double i ,double j, double k){
		x = i;
		y = j;
		z = k;
	}
	
	 void setX(double i){
		x = i;
	}
	
	 void setY(double j){
		y = j;
	}
	
	 void setZ(double k){
		z = k;
	}
	
	double countDistance(Point p){
		return (x - p.x)*(x-p.x) + (y - p.y)*(y - p.y) + (z-p.z)*(z-p.z);
	}
	
}

public class PointTest{
	public static void main(String args[]){
		Point p = new Point(2.3,5.6,11.5);
		Point p1 = new Point(0.0,0.0,0.0);				
		System.out.println (p.countDistance(p1));
		p.setX(5.0);
		System.out.println(p.countDistance(new Point(1.0,2.0,3.0)));
	}
		
}