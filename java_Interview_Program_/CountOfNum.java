package java_Interview_Program_;

import java.util.HashMap;
import java.util.TreeMap;

public class CountOfNum {

	public static void main(String[] args) {
	
		duplicateCharCount("Bharath");
	}

	public static void duplicateCharCount(String str) {
	
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] chars = str.toCharArray();
		
		for(char c : chars)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
