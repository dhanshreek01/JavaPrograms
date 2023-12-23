package java_Interview_Program_;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		multiTable(18);
 
	}

	public static void multiTable(int num) {
		
		int mult=1;
		for(int i=1; i<11;i++)
		{
			mult = num*i;
			System.out.println(num + "*" + i +" =" + mult);
		}
	}
	
}
