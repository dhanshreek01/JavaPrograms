package java_Interview_Program_;

public class Sum_even_Numbers {

	 static int sum=0;
	 
	public static void main(String[] args) {
		// sum of all even numbers till 10
		//2,4,6,8,10= 30
	
		sumEven();
	}

	public static void sumEven() {
		int sum=0;	
		for(int i=0; i<=20; i++)
		{
			
			if(i%2==0)
			{
				sum = sum + i;
			}
		}
		System.out.println(sum + " is sum of all even number");
	}
	}
