package java_Interview_Program_;

public class PerimeterofReact {

	public static void main(String[] args) {
		// 2*( length+width)

		perii(5,10);
	}

	public static void perii(int length, int width)
	{
		
		int perimeter=0;
		
		perimeter = 2 * (length + width);
		
		System.out.println(perimeter + " is perimeter!! ");
	}
}
