


public class compSciTest {
	
	public static void main (String[] args) {
		System.out.println("Akaash Banerjee");
		int x = IBIO.inputInt("Please enter a number between 1 and 9: ");
		while(x<1 || x>9 && x!=0)
		{
			System.out.println("Error - number is out of range");
			//System.exit(1);
			x = IBIO.inputInt("Please enter a number between 1 and 9: ");


			}

			for(int i = 1; i<=20; i++)
			{	
				
				System.out.println(x + " x " + i + " = " + x*i);
				
				
			}
			
			while(x !=0)
			 x = IBIO.inputInt("Please enter a number between 1 and 9: ");


}
}
