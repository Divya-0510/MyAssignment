package week1.day1;

public class ClassStudent {
	public void studentDetails() {
		String studentName= "Divya";
		int rollNo=07;
		String collegeName="SSS Jain College";
		float cgpa =40f;
		int markScored= 450;
		System.out.println(collegeName);
		System.out.println(cgpa);
		System.out.println(collegeName);
		System.out.println(markScored);
		System.out.println(rollNo);	
	}

	public static void main(String[] args) {
	
		ClassStudent details=new ClassStudent();
		details.studentDetails();
		
		
	}

}
