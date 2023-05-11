

public class twoDimensionalArrayPractice {
	
	public static void main (String[] args) {
		int [][] colours = { {0,0,0,0,0,0,0,1,0,0}, {0,0,0,1,0,0,0,0,1,0}, {0,0,0,1,0,0,0,0,0,1}, {0,0,0,1,0,0,0,0,0,0} , {0,0,0,1,0,0,0,0,0,0} , {0,0,0,1,0,0,0,0,0,0} , {0,0,0,1,0,0,0,0,0,0} , {0,0,0,1,0,0,0,0,0,0} , {0,0,0,1,1,1,1,1,0,0} , {0,0,0,0,0,0,0,0,0,0}};
		int [][] reverse = new int[10][10];
		
		
		for(int i=0; i<colours.length; i++) {
			System.out.println();
			for(int j=colours[i].length-1; j>0; j--) {
				reverse[i][j] = colours[i][j];
				System.out.print(reverse[i][j]+" ");
			}
		}
	}
}

