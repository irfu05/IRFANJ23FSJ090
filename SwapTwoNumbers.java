package assignments;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		 float first = 2.50f, second = 4.50f;
		 
		 System.out.println("...Before swap...");
		 System.out.println("First number =" + first);
		 System.out.println("Second number =" + second);
		 
		 // Value of first is assigned to temporary
		 float temporary = first;
		 
		 //Value of second is assigned to temporary
		 first = second;
		 
		 //Value of temporary is assigned to second
		 second = temporary;
		 
		 System.out.println("...After swap..");
		 System.out.println("First number =" + first);
		 System.out.println("Second number =" + second);
		 
	}

}
