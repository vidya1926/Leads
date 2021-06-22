package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		int [] num= {2,7,11,15};
		int difference=9;
		Map<Integer,Integer> sum=new HashMap<Integer, Integer>();
		

for(int i=0;i<num.length;i++)
{sum.put(num[i],i);
	
	
}	for(int i=0;i<num.length;i++)
	{int diff=difference-num[i];
	if(sum.containsKey(diff)  &&  sum.get(diff)!=i)
	{
		System.out.println(i+" "+sum.get(diff));
		break;
	}
	}
	}
	}
