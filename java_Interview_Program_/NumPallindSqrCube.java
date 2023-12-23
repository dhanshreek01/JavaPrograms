package java_Interview_Program_;

public class NumPallindSqrCube {

	public static void main(String[] args) {
		
		//numPalli(121);
		squareCubeNum(2);
	}

	public static void numPalli(int num)
	{ 
		int baseNum= num;
		int revNum;
		String revo="";
		while(num>0)
		{
			revNum = num%10;
			System.out.print(revNum);
			revo = revo + revNum;
			num= num/10;
		}
		System.out.println( "\n" +revo);
		if(revo.equals(Integer.toString(baseNum)))
		{
			System.out.println("yes");
		}else {
			System.out.println("no");
		} 
	}
	
	public static void squareCubeNum(int num) {
		
		int sq = num *num;
		System.out.println(sq + " is square of number");
		int cu = num*num*num;
		System.out.println(cu + " is cube of number");
	}
}
