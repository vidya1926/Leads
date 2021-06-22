package week3.Assignment;

import java.util.HashMap;
import java.util.Map;

public class Characteroccurance {

	public static void main(String[] args) {
		String name="Vidyabharathi";
		char[] cA=name.toCharArray();
		
		
Map<Character,Integer> occur=new HashMap<Character,Integer>();

for(int i=0;i<cA.length;i++)

occur.put(cA[i],occur.getOrDefault(cA[i],0)+1);
	
System.out.println(occur);

	}

}
