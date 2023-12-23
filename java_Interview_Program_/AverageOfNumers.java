package java_Interview_Program_;

public class AverageOfNumers {

	public static void main(String[] args) {
 
		int[] numbers = {2,2,2,2};
		
		averagee(numbers);

	}

	public static void averagee(int[] numbers)
	{
		int sum=0; 
		int size = numbers.length;
		int avg=0;
		
		for(int i=0; i<numbers.length;i++)
		{
			sum= sum + numbers[i];
		}
		
		avg = sum /size;
		System.out.println(avg + " is average of numbers!");
	}
}
