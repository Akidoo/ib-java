import java.time.LocalTime;
import java.time.Duration;

public class mathsGame {
	public static void main (String[] args) {
		LocalTime startTime = LocalTime.now();
		for(int i = 0; i<6; i++){
			double a = Math.round(Math.random()*10);
			double b = Math.round(Math.random()*10);
			IBIO.out(a + " + " + b + " = ");
			int answer = IBIO.inputInt(" ");
			if(answer == a + b){
				System.out.println("Correct!");
			} else {
				System.out.println("Wrong!");
				break;
			}
			
		}
		LocalTime endTime = LocalTime.now();
		Duration timeTaken = Duration.between(startTime, endTime);
		System.out.println("Total time: " + timeTaken);
	}
}

