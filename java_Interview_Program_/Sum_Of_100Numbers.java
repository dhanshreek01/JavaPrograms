package java_Interview_Program_;

public class Sum_Of_100Numbers {

	public static void main(String[] args) {
		// 100 numbers

		summ();
	}
	public static int summ()
	{
		int sum=0;
		
		for(int i=0; i<=100; i++)
		{
			sum = sum +i;
		}
		System.out.println(sum);	
		return sum;
	}
     
}
