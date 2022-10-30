


public class CompSci {
	
	public static void main (String[] args) {
		System.out.println("Akaash Banerjee");
		int x = IBIO.inputInt("Please input a positive number less than 10: ");
		while(x>=10 || x<1)
				{
		System.out.println("Error - invalid input");
		x = IBIO.inputInt("Please input a positive number less than 10: ");
	}
		for( int y = 1; y<=x; y++)
		{
		IBIO.out(y + " "); 
		int square = y*y;
		if(square<10)
		{ 
			IBIO.out(" ");
			}
		IBIO.out(square + " ");
		int power = 1;
		for(int j = 1; j<=y; j++)
		{
			power = x*power;
		}
		int digits = 0;
		int number = power;
		IBIO.output(power);
		
		}
	
		
	}
}

