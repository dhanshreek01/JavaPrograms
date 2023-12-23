package java_Interview_Program_;

public class Power_of_Number {

	public static void main(String[] args) {
		// find power of number, power and num should be given from user

		powerOfnum(4,3);
	}

	public static void powerOfnum(int num, int power) {
		
		int intialNum = num;
		for(int i=1; i<power;i++)
		{
			num = intialNum *num;
		}
		System.out.println(num + " is power of " + intialNum);
	}
}
