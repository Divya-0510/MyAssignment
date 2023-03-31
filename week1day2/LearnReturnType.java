package week1day2;

public class LearnReturnType {
	
	public void add() {
		int a=10;
		int b=15;
		System.out.println(a+b);
	}

	public void sub() {
		int a=15;
	    int b=5;
	    return a-b;
	    
	    
		
	}
	public static void main(String[] args) {
	
		LearnReturnType cal=new LearnReturnType();
		
		cal.add();
		cal.sub();
		
		System.out.println(cal.sub());
		
		

		
				

	}

}
