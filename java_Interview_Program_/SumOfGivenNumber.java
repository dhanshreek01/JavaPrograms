package java_Interview_Program_;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		// Sum of inputed num

		sums(243134);
	}

	public static void sums(int num)
	{
		
		//num= 1234;
		int rem=0;
		int add=0;
		
	    while(num!=0)
		{
		rem = num%10; //123
		add = add + rem;
		num= num/10;
		}
	
		System.out.println(add);
		
	}
}
