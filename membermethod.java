import java.util.Scanner;

class Box{
	double length;
	double breadth;
	double height;
	
	double volume(){
		return length*breadth*height;
	}
	
	void set(double l,double  b,double h){
		length=l;
		breadth=b;
		height=h;
	}
}

public class membermethod {
	public static void main(String[] args) {
		Box Mybox1 = new Box();
		double a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length,breadth and height of box: ");
		a=scan.nextDouble();
		b=scan.nextDouble();
		c=scan.nextDouble();
		Mybox1.set(a,b,c);
		double volume1= Mybox1.volume();
	    System.out.println(volume1);
	}
}
