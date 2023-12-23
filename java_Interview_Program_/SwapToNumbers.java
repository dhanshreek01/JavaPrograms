package java_Interview_Program_;

public class SwapToNumbers {

	public static void main(String[] args) {
		// swap num with and without third variable
		
		//withThird(3,8);
		withoutThird(1,3);
	}

	public static void withThird(int a, int b)
	{
		System.out.println( a +  " a before swapping");
		
		System.out.println( b +  " b before swapping");
		
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
        System.out.println( a +  " a after swapping");
		
		System.out.println( b +  " b after swapping");
		
	}
	
	public static void withoutThird(int a, int b)
	{
        System.out.println( a +  " a before swapping");
		
		System.out.println( b +  " b before swapping");
		
		a= a+b; 
	    b=a-b;	
		a= a-b; 
	
        System.out.println( a +  " a after swapping");
		
		System.out.println( b +  " b after swapping");
		
		
	}
}
