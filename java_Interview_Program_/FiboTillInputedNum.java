package java_Interview_Program_;

public class FiboTillInputedNum {

	public static void main(String[] args) {
		
		fiboO(50);
	}

	public static void fiboO(int num)
	{
		int a=0, b=1, temp=0;
		
		while(temp<num)
		{
			temp = a; //0
			a= a+b; //1
			System.out.print(a + " ");
			b=temp;
			
		}	
	}
}
