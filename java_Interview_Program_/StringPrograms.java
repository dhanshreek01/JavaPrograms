package java_Interview_Program_;

public class StringPrograms {

	public static void main(String[] args) {
		//revv();
		//checkPallindrome();
		withoutPositnRev("I am Don");
	}
	
	public static String rev(String str)
	{
		String revStr="";	
		for(int i=str.length()-1; i>=0; i--)
		{
			revStr = revStr + str.charAt(i);
		}
		
		return revStr;
	}
	public static void revv() {
		
		String c = rev("dhanshree");
		System.out.println(c);
	}
	
	public static void checkPallindrome() {
		String Str="madam";
		String revvvo = rev(Str);
		
		if(Str.equals(revvvo))
		{
			System.out.println("pallindrome");
		}else {
			System.out.println("not Pallindrome");
		}
	}
	
	public static void withoutPositnRev(String str) {
		
		String[] words = str.split(" ");
		String revStr="";
		
		for(String word : words)
		{
			String revWord ="";
			for(int i=word.length()-1; i>=0; i--)
			{
				revWord = revWord + word.charAt(i);
			}
			revStr = revStr +" " + revWord;
		}
		
		System.out.println(revStr);
	}
}
