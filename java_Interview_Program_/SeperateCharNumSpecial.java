package java_Interview_Program_;

public class SeperateCharNumSpecial {

	public static void main(String[] args) {
		
		seperate("f@#vsfgv24534!@3");
	}

	public static void seperate(String str) {
		
		char[] chars = str.toCharArray();
		String z="";
		String x= "";
		String y="";
		int zC=0 , xC=0, yC=0;
		for(char c : chars )
		{
			if(Character.isAlphabetic(c))
			{
				z = z + c;
				zC++;
			}else if(Character.isDigit(c))
			{
				x = x+ c;
				xC++;
			}else {
				y = y+c;
				yC++;
			}
		}
		System.out.println( zC+"Characters >> " + z +"\n" +xC +"Numbers > " + x +"\n" + yC+ "others > " + y);
	}
}
