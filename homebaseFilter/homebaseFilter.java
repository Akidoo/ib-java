
public class homebaseFilter {
	
	public static String[] Filter = {"Solis", "solis", "SOLIS"};
	public static String[] Filter2 = {"Lai", "lai", "LAI"};
	
	public static int Solis (String[] Homebase) {
		int count = 0;
		for(int i=0; i<Homebase.length;i++){
			for(int j=0; j<Filter.length; j++){
			if(Homebase[i].contains(Filter[j])){
				count = count + 1;
				if(j == Filter.length){
					j = 0;
					}
					break;
				}
			}

			}
			return count;
			
	}
	public static int Lai (String[] Homebase) {
		int count = 0;
		for(int i=0; i<Homebase.length;i++){
			for(int j=0; j<Filter2.length; j++){
			if(Homebase[i].contains(Filter2[j])){
				count++;
				if(j == Filter2.length){
					j = 0;
					}
					break;
				}
			}

			}
			return count;
		}
	
	public static void main (String[] args) {
		String[] Homebase = {"HB9 SOLIS PAZ","HB09 Solis Paz","10 lai g10","HB10 Lai" ,"RP 10","Kento taira 9 solis","9Solis Paz","Rysavy, 9","Ms Yeo Grade 11","11 Riddell","HB09 Solis", "Shayaan Shifaz","1019 grade 10","HB-09-03","G-09,HB Wee 9" ,"HB09 Solis Paz  grade 9","HB 09 Solis","9 Solis","HB  Vlok Grade 11","HB09 Solis-Paz","HB09 Solis Paz","HB DAS","26misakih@gmail.com","Rippel Grade 9","HB Selleck 11","HB09 Mitra","Mr. Riedeman 11","10Lai","MR Riedeman Grade 11","yellow,HB 09 Plain","9 Solid Paz","11 Reideman","HB10 Lai - Nicholas Byrne","Smee 10","edison hb10 lai","HB09-03","10Brieta","HB Lai G10","kaveena raj 10 lai","grade10,King Grade 10","10 lai" ,"HB10 LAI","11 riedman","HB11 Banerjee","Baker 11","Cooney 11","HB09 Rogozinski","Ms. Thomas Gd9","vainavi 10Lai","HB 10 ZHU", "G10 Mr Woollard","Ishaan Narain 11 Riedman","Mr. Riedman","Mr. Reideman g11","SPP Level 2 Grade 9" ,"11Dulley","11Selleck"};
		System.out.println("Number of responses from HB09 Solis: " + Solis(Homebase));
		System.out.println("Number of responses from HB10 Lai: " + Lai(Homebase));
	}
}

