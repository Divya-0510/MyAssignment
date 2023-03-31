package week1.day1;

public class Mobile {
	
	//2 methods (makeCall() , sendMsg()) with simple print statement
	//In first method create variable  mobileModel (String),mobileWeight (float)
	
	//Variable//
	
	public void makecall() {
		String mobileModel="Apple";
		float mobileWeight=2.1f;
		System.out.println("mobile model" + mobileModel);			
		
	}
		
//In second method create variable  isFullCharged (boolean),mobileCost (int)
				
	
     public void sendMsg() {
     boolean FullCharged= true;
     int mobileCost= 50000;
     System.out.println("Mobile Cost"+mobileCost); 
     
     //Create object for class and call  from main method
 		
		}
	
	

	public static void main(String[] args) {
		Mobile function=new Mobile();
		function.makecall();
		function.sendMsg();
		System.out.println("This is My Mobile");
		


	}

}
