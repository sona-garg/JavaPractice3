
public class Overload_Area {
	public static double area(int r) {
		double area = 3.14*r*r;
		return area;
		
		}

	public static double area(int len,int wid) {
		double area = len*wid;
		return area;
		
	}

	public static void main(String[] args) {
		double area1=area(4);
		double area2=area(3,4);
		System.out.println("The area of circle is:"+area1);
		System.out.println("The area of rectangle is:"+area2);
		
		
		

	}

}
