

public class ohNo {
	
	public static void main (String[] args) {
		
		
		double temp[] = {13.3,16.6,12.6,14.3};
		int i;
		double sum = 0;
		double max = temp[0];
		double min = temp[0];
		
		for(i = 0; i<temp.length; i++){
			sum+= temp[i];
			
			}
			System.out.println(sum/temp.length);
			for(i = 0; i<temp.length; i++){
		while(max<temp[i]){
			max = temp[i];
		}
	}
		System.out.println(max);
		
		for(i = 0; i<temp.length; i++){
		while(min>temp[i]){
			min=temp[i];
		}
	}
		System.out.println(min);
	}
	
}

