import java.util.Stack;

public class Q4Test
{
    public static int[] clone(int[] a)
    {
        int[] cloneArray = new int[a.length];
        for(int i = 0; i<cloneArray.length; i++){
        cloneArray[i] = a[i];
	}
        return cloneArray;
    }

    public static String[] clone(String[] a)
    {
        String[] cloneArray = new String[a.length];
        for(int i = 0; i<cloneArray.length; i++){
        cloneArray[i] = a[i];
	}
        return cloneArray;
    }

    public static void printArray(String[] array)
    {
	for(int i = 0; i < array.length; i++)
		{
			System.out.printf(array[i] + " ");
		}
		System.out.println();
    }

    public static void printArray(int[] array)
    {
		for(int i = 0; i < array.length; i++)
		{
			System.out.printf(array[i] + " ");
		}
		System.out.println();
    }

    public static void parallelPrint(String[] sa, int[] ia)
    {
	 for (int i = 0; i < ia.length; i++) {
            System.out.printf("%s %d\n", sa[i], ia[i]);
        }
    }

    // true if arrays may be parallel, false otherwise
    public static boolean areParallel(String[] sa, int[] ia)
    {
		for (int i = 0; i < ia.length; i++) {
            
        }
        return false; // change...
    }

    public static void search(String[] sa, int[] ia, int goals)
    {
		goals = 120;
		 for (int i = 0; i < ia.length; i++) {
            if (ia[i] > goals) {
                System.out.printf("%s %d\n", sa[i], ia[i]);
            }
        }
        
    }

    public static void selectionSort(String[] sa)
    {
	 int currentIndex = 0;
    while( currentIndex < sa.length - 1 )
    {
        int smallestIndex = currentIndex;
        String smallestValue = sa[smallestIndex];
        int checkIndex	  = smallestIndex + 1;
        while( checkIndex < sa.length )
        {
            if(sa[checkIndex].compareTo(smallestValue) < 0)
            {
                smallestIndex = checkIndex;
                smallestValue = sa[checkIndex];
            }
            checkIndex++;
        }
        sa[smallestIndex] = sa[currentIndex];
        sa[currentIndex] = smallestValue;
        currentIndex++;
	}
    }

    public static void bubbleSort(int[] array)
    {
	for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
    }

    public static void parallelSelectionSort(String[] sa, int[] ia)
    {

    }

    public static void parallelBubbleSort(String[] sa, int[] ia)
    {
	for(int i = 0; i > ia.length - 1; i++) {
			for(int j = 0; j > ia.length - i - 1; j++) {
				if(ia[j] < ia[j+1]) {
					int temp = ia[j+1];
					ia[j] = ia[j+1];
					ia[j] = temp;
				}
				 
			}
			System.out.printf("%s %d\n", sa[i], ia[i]);
		}
    }


    public static void main(String[] args)
    {
        String[] bad = {"Cow", "Chicken", "Johnny", "Diddy", "Dexter"};
        String[] originalPlayers = {"Perpetua", "Maribel", "Homare", "Lotta", "Eugenie", "Vivianne", "Portia",
                "SunWen", "Patrizia", "Marta", "Julie", "Birgit", "Maysah", "Abby", "Christine"};
        int[] originalRecords = {80, 82, 83, 88, 88, 95, 101, 106, 110, 115, 116, 128, 130, 184, 190};
        String[] players1 = clone(originalPlayers); // clone = #1
        int[] records1 = clone(originalRecords);
        String[] players2 = clone(originalPlayers);
        int[] records2 = clone(originalRecords);
        String[] players3 = clone(originalPlayers);
        int[] records3 = clone(originalRecords);

        System.out.println("\nPrint player names array");
        printArray(players1); // 2
        System.out.println("\n\nPrint array of goals");
        printArray(records1); // 3
        System.out.print("\n\nCheck if the arrays are parallel: ");
        if( !areParallel(bad, records1) ) // 4 areParallel
        {
            System.out.println("Error-Arrays are not parallel");
        }
        System.out.println("\nPrint parallel arrays");
        parallelPrint(players1, records1); // 5
        System.out.println("\nPlayers with 120 goals or more by name (linear search)");
        search(players3, records3, 120); // 6
        System.out.println("\nSort players alphabetically with selection sort");
        selectionSort(players1); // 7
        printArray(players1);
        System.out.println("\n\nSort records by most goals using bubble sort");
        bubbleSort(records1); // 8
        printArray(records1);
        System.out.println("\n\nSort parallel arrays by most goals using bubble sort");
        parallelBubbleSort(players2, records2); // 9
        System.out.println("Top scorers");
        parallelPrint(players2, records2);
        System.out.println("\nSort parallel arrays by player names with selection sort");
        parallelSelectionSort(players3, records3); // 10
        System.out.println("Players by name");
        parallelPrint(players3, records3);
        // +: beautify the output
    }
}
