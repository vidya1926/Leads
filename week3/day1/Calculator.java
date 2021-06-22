package week3.day1;

public class Calculator {
	
public static int mathcal(int a,int b) {
	return  a+b;
	}
public static int mathCal1(int c,int d, int e ){
		return c+d+e;
	}
public	static int mathCal11(int x,int y)
	{return x*y;
	}
	
public static double mathCal2(int p,double q) {
		return p* q;
	}
	
public static int mathCal22(int f, int g) {
		return f-g;
	}
		
public	static double mathCal3(int h,double i) {
		return h-i;
	}
	
public	static int mathCal(int k,int l)
	{return k/l;
	}
public static double mathCal(int m,double n )
	
{return m/n;
} 
public static void main(String[] args) {
	Calculator cal=new Calculator();
	System.out.println(Calculator.mathCal(2, 3.5));
System.out.println(Calculator.mathcal(11,15));
	System.out.println(Calculator.mathCal22(25,10));
System.out.println(cal.mathCal3(47,22.8));
	System.out.println(Calculator.mathCal(55, 2));
	
}
}
/*Create class Calculator with below methods
- 2 methods for add, 1 method with 2 int args , 1 method with 3 int args
- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
- 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
- 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int
create object for the Calculator class and execute all the methods
*/