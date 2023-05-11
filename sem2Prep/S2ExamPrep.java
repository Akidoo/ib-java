/*
 * Exam Prep Java Programming Problem
 * 
 * 1.	Write a method to traverse the random array and count the single digit primes inside of it. Use the primes array to do so.
 * 2.	Write a method that will find the largest and smallest prime in the random array.
 * 3.	Write a method to calculate the average of all the primes found in the random array.
 * 
 */


public class S2ExamPrep
{
	// this array is global so that you may it them in any of your methods easily
	static int[] primes = { 2, 3, 5, 7 };
	
	// complete your methods here
	public boolean isPrime(int n)
	{
		
			for(int j = 0; j<primes.length; j++){
				if(n == primes[j]){
					return true;
					}
				}
			return false;
	}
	
	 public static int count(int[] array)
	{
		int counter = 0;
		for(int i = 0; i<array.length; i++){
			for(int j = 0; j<primes.length; j++){
				if(array[i] == primes[j]){
					counter = counter + 1;
					}
				
				}
			
			}
			return counter;
	}
	/*
	public static int largest(int[] array)
	{
		
	}
	
	public static int smallest(int[] array)
	{
		
	}
	
	public static double average(int[] array)
	{
		
	}
*/
	public static void main (String[] args)
	{
		int[] random = { 8, 6, 1, 9, 3, 6, 6, 8, 8, 8, 7, 9, 2, 5, 6, 7, 6, 6, 6, 7, 7, 8, 3, 3, 5, 5, 5, 8, 3, 5, 9, 4, 3, 7, 9, 9, 4, 7, 8, 3, 1, 9, 4, 6, 1, 1, 8, 2, 5, 3, 6, 9, 7, 1, 8, 3, 2, 8, 3, 8, 1, 9, 3, 3, 3, 8, 8, 4, 6, 4, 7, 5, 6, 6, 3, 2, 2, 2, 4, 7, 6, 2, 6, 3, 8, 5, 8, 3, 9, 9, 4, 8, 3, 6, 6, 4, 1, 3, 8, 6, 1, 1, 8, 3, 2, 9, 9, 2, 5, 5, 1, 3, 1, 9, 2, 4, 3, 3, 2, 2, 1, 3, 8, 4, 8, 2, 8, 1, 2, 8, 2, 5, 5, 4, 7, 6, 4, 1, 7, 4, 5, 1, 1, 9, 3, 8, 3, 9, 4, 2, 4, 7, 9, 9, 4, 2, 3, 4, 5, 8, 6, 9, 6, 6, 6, 5, 4, 7, 1, 4, 7, 2, 1, 6, 9, 1, 6, 7, 5, 4, 4, 1, 4, 2, 4, 2, 4, 5, 3, 9, 6, 6, 5, 5, 5, 1, 1, 7, 8, 5 };
		
		System.out.println( count(random) );
		/*
		System.out.println( largest(random) );
		System.out.println( smallest(random) );
		System.out.println( average(random) );
		*/
	}
}

