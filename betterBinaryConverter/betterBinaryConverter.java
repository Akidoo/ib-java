
//this one is broken too. I'll fix it later my brain hurts
public class betterBinaryConverter {
	
	public static void main (String[] args) {
		
		int mult = 1;
		int sum = 0;
		int num = IBIO.inputInt("Input a binary number: ");
		
		for(int i = 0; i<=8; i++, mult *= 2) {
			sum += (num%2)*mult;
			num = num/10;
		}
		System.out.println(sum);
		
	}
}

