//Improving Kamya's chatbot

public class chatBot {
	
	public static void main (String[] args) {
		System.out.println("Hi! I'm Emily, an interactive chatbot!");
		String name = IBIO.input("What's your name? ");
		System.out.println("Hi " + name + "! That's a really nice name!");
		int bedtime = IBIO.inputInt("What time do you go to bed? (2400hrs format): ");
		if(bedtime <= 2100){
			System.out.println("That's a Healthy time to go to sleep! :D");
			} else {
				
				System.out.println("you should sleep earlier ya ding dong");
				
				}
			String distance = IBIO.input("Do you live far from your school? ");
			if(distance.equals("yes")){
				System.out.println("wooooooo take the bus");
				
				} else {
					System.out.println("don't take the bus");
					
					}
	}
}

