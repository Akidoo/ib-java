

public class moreArrayPractice {
	
	public static void main (String[] args) {
		
		double temp[] = {12.4,12.4,12.3,13.0};
		int i;
		double sum = 0;
		double max = temp[0];
		double min = temp[0];
		
		//Average
		for(i = 0; i<temp.length;i++){
			sum+= temp[i];
			
			}
			System.out.println(sum/temp.length);
			
			//Max temperature
			for(i = 0; i<temp.length;i++){
			if(temp[i]>max) {
			max = temp[i];
				
		}
	
	}
	System.out.println(max);
	
	//Min temperature
	for(i = 0; i<temp.length;i++){
			if(temp[i]<min) {
			min = temp[i];
				
		}
		
		
	
	}
	System.out.println(min);
}
}


