package week3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
public static void main(String[] args) {
	List<String> input= new ArrayList<String>();
	
	
	input.add("HCL");
	
	input.add("Wipro");
	input.add("Aspire System");
	input.add("CTS");
	System.out.println(input.size());
	Collections.sort(input);
	System.out.println(input);
	Collections.reverse(input);
	System.out.println(input);
	
	
	
}
}
