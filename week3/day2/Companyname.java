package week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Companyname {

	public static void main(String[] args) {
		String companyName="Testleaf";
		
				char[] charArray=companyName.toCharArray();
				
				Set<Character> same=new HashSet<Character>();
				
				for(int i=0;i<charArray.length;i++) {
				
					if(same.add(charArray[i]))
					{System.out.print(charArray[i]);
				}
				
				
	}
	}
}
