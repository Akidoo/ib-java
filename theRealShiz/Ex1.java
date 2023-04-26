public class Ex1 {
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("How many lines? ");	
		for(int i = 0; i<n; i++){
			String aa = "";
			for(int j = 0; j<=i; j++){
				aa = aa + "*";
			}
			IBIO.output(aa);
		}
	}
}

