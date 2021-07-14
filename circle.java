class Circle{
	double radius;
	
	double Area(){
		return 2*3.14*radius*radius;
	}
	
	void set(double r){
		radius =r;
	}
}


public class circleArea{
	public static void main(String[] args) {
	  Circle C1 = new Circle();
	  C1.set(4);
	  double Area1 = C1.Area();
	  Circle C2 = new Circle();
	  C2.set(6);
	  double Area2 = C2.Area();
	  Circle C3 = new Circle();
	  C3.set(8);
	  double Area3 = C3.Area();
	  if(Area1>Area2 && Area1>Area3)
	  	System.out.println(Area1);
	  else if (Area2>Area1 && Area2>Area3)
	  	System.out.println(Area2);
	  else if(Area3>Area2 && Area3>Area1)
	  	System.out.println(Area3);
	}
}