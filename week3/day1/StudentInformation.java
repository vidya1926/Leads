package week3.day1;

public class StudentInformation {
	
	public void studentInfo(int id) {
		System.out.println("The id is 22");
		}

	public void studentInfo(int id,String name)
	{System.out.println("The id is 22");
	System.out.println("Student name is Sanjay");
	}
	public void studentInfo(String email,long phoneno)
	{System.out.println("The student EmailId is :sanjay@gmail.com");
	System.out.println("Phone No: 8755870231");
	}
public static void main (String[] args) {
	StudentInformation info=new StudentInformation();
    info.studentInfo(22);
	info.studentInfo(22,"Sanjay");
	info.studentInfo("sanjay@gmail.com",8755870231L);
	
}
}