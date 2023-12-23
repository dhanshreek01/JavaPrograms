package java_Interview_Program_;

public class Perimeter_Circle {

	public static void main(String[] args) {

          //2piR
		peri(5);
		

	}
	public static void peri(int radius) {
		
		double perimeter=0;
		double pi= 3.14;
		
		if(radius >1)
		{
			perimeter = 2*pi*radius;
		}
		System.out.println(perimeter);
	}

}
