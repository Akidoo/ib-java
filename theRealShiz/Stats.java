

public class Stats {
	
	public static void main (String[] args) {
		System.out.println("Akaash Banerjee");
		int count = IBIO.inputInt("How many inputs? ");
		while(count<3){
		System.out.println("Error: input must be greater than 2");
		count = IBIO.inputInt("How many inputs? ");
		
		}
		double largest=0; 
		for(int i = 0; i<count; i++){
			double num = IBIO.inputDouble("What number? ");{
			if(i==0)	
				 largest = num; 
	
			 
			if (num > largest)
		{
			largest = num; }
			double smallest=0; 
			if(i==0)	
				 smallest = num; 
	
			 
			if (num < smallest)
		{
			smallest = num; }
		
			}
			 
	}
	System.out.println("The maximum is " + largest);

	
	
}
}
