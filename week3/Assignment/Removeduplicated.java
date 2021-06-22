package week3.Assignment;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicated {

	public static void main(String[] args) {
		String name="PayPal";
		char[] charArray=name.toCharArray();
		
		Set<Character> same=new HashSet<Character>();
		for(int i=0;i<charArray.length;i++)
		{
			if(same.add(charArray[i]))
				
	System.out.print(charArray[i]);
}
}
		
		
	}



