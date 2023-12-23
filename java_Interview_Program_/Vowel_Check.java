 package java_Interview_Program_;

public class Vowel_Check {

	public static void main(String[] args) {


		String str = "bharath";
		char[] ch = str.toCharArray();
		boolean IsVowel = false;
		
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]=='a' ||ch[i]=='e'|| ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				IsVowel = true;
				break;
			}else
			{
				IsVowel= false;
			}
		}
	System.out.println(IsVowel);
	}
	

}
