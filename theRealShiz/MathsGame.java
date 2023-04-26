


public class MathsGame {
	
	public static void main (String[] args) {
		
		double a = Math.random() * 10;
		double b = Math.random() * 10;
		int lives = 1;
		int num = 6;
		int score = 0;
		
		for(int i = 0; i<num; i++){
			System.out.print(Math.round(a) + " + " + Math.round(b) + " = ");
			int x = IBIO.inputInt(" ");
			
			if (x == (Math.round(a) + Math.round(b))) {
				score = score++;
				System.out.println("Correct!");
			}
			else {
				System.out.println("Wrong!");
				System.exit(69);
			}
				
			}
			
			
		
		
		while(lives >0) {
			
			}
	
	}
}

