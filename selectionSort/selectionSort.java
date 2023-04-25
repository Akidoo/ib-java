
public class selectionSort {
	
		public static void main(String[] args) {
		
		int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};
		String names[] = {"Kai", "Tobias", "Oliver", "Akaash"};
		
		selectionSort(array);
		selectionSortString(names);
		
		for(int i : array) {
			System.out.print(i);
		}	
	}

	private static void selectionSort(int[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
	}
	
	public static void printArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf( "[%d]%-2s  ",i , a[i]);
		}
		System.out.println();
	}
	public static void selectionSortString(String[] a)
{
    int currentIndex = 0;
    while( currentIndex < a.length - 1 )
    {
        int smallestIndex = currentIndex;
        String smallestValue = a[smallestIndex];
        int checkIndex	  = smallestIndex + 1;
        while( checkIndex < a.length )
        {
            if(a[checkIndex].compareTo(smallestValue) < 0)
            {
                smallestIndex = checkIndex;
                smallestValue = a[checkIndex];
            }
            checkIndex++;
        }
        a[smallestIndex] = a[currentIndex];
        a[currentIndex] = smallestValue;
        currentIndex++;
        System.out.print("\t");
	}
        printArray(a);
    
}
}




