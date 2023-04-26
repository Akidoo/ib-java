


public class javaWorksheet {
	
	public static void main (String[] args) {
		
		
		int num = IBIO.inputInt("How many lines? ");
		String aa = stars(num);
		IBIO.out("\n");
		for(int i = 0; i<num; i++)
			IBIO.output(aa);
	}
	
	static String stars(int n)
	{ String xx = "          ";
		for(int i = 0; i < n; i++)
		xx = xx + "*";
		return xx;
	}
}

