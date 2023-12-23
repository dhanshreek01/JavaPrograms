package java_Interview_Program_;

public class Find_Quotient_Reminder {

	public static void main(String[] args) {

		remind(10,5);
		

	}

	public static void remind(int a, int b) {
		
		int rem=0;
		int div=1;
		
		if(b>1)
		{
		    rem = a%b;
		    
		    div= a/b;    
		}
		System.out.println(rem + " is reminder");
		System.out.println(div + " is division");
	}
}
