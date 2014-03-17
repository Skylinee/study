package com.louis.april;
class NewPoint{
	double x,y;
	NewPoint(double x1, double y1){
		x = x1;
		y = y1;
	}
	
	public double getX(){return x;}
	public double getY(){return y;}
	public void setX(double i){ x = i;}
	public void setY(double i){ y = i;}
}

class Circle{
	private NewPoint o;
	private double radius;
	
	Circle(NewPoint p, double r){
		o = p;
		radius = r;
	}
	
	Circle(double r){
		o = new NewPoint(0.0,0.0);
		radius = r;
	}
	
	boolean contains(NewPoint p) {
		double x = p.getX() - o.getX();
		double y = p.getY() - o.getY();
		if (x*x + y*y > radius*radius) 
				return false;
			else
				return true;
	}
	
	public void setO(double x, double y){
		o.setX(x);
		o.setY(y);
	}
	
	public NewPoint getO(){ return  o;}
	public double getRadius(){return radius;}
	public void setRadius (double r) {
		radius = r;
	}
	public double area(){
		return 3.14*radius*radius;
	}	
}

public class CircleTest{
	public static void main(String arg[]){
		Circle c1 = new Circle(new NewPoint(1.0,2.0),2.0);
		Circle c2 = new Circle(5.0);
		System.out.println("c1:" + c1.getO().getX() );
		System.out.println("c2:" + c2.getO().getY() );
		System.out.println("c1:" + c1.getRadius());
		System.out.println("c1 area:" + c1.area());
		c1.setO(5.0, 5.0);
		c1.setRadius(10.0);
		System.out.println("c1:" + c1.getO().getX() );
		System.out.println("c1 area:" + c1.area());
		NewPoint p1 = new NewPoint(20.3,15.3);
		System.out.println("P1 是否在圆1�? " + c1.contains(p1));
		System.out.println("P1是否在圆2内： " + c2.contains(p1));
	}
}


