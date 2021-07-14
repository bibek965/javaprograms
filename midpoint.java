class Mypoint{
	double xco;
	double yco;
	
	double p1(){
		return xco;
	}
	double p2(){
		return yco;
	}
	
	void set(double a, double b){
		xco=a;
		yco=b;
	}
}


public class midpoint {
	public static void main(String[] args) {
		Mypoint Mypoint1 = new Mypoint();
		Mypoint1.set(2,3);
		Mypoint Mypoint2= new Mypoint();
		Mypoint2.set(6,7);
		double Mypoint1p1 = Mypoint1.p1();
		double Mypoint1p2 = Mypoint1.p2();
		double Mypoint2p1 = Mypoint2.p1();
		double Mypoint2p2 = Mypoint2.p2();
		double midp1 = (Mypoint1p1+Mypoint2p1)/2;
		double midp2 = (Mypoint1p2+Mypoint2p2)/2;
		System.out.println("Mid point is ("+midp1+","+midp2+")");
	}
}