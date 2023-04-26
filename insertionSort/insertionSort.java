

public class insertionSort {
	
	public static void main(String[] args) {
		
		int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};
		String names[] = {"Kai", "Tobias", "Oliver", "Akaash"};
		
		insertionSortInt(array);
		insertionSortString(names);
		
		
		for(int i : array) {
			System.out.print(i);
			System.out.print(", ");
		}	
		for(String i : names) {
			System.out.print(i);
			System.out.print(", ");
		}	
	}

    public static void insertionSortInt(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
     public static void insertionSortString(String[] names) {
        for (int i = 1; i < names.length; i++) {
            String current = names[i];
            int j = i - 1;
            while (j >= 0 && names[j].compareTo(current) > 0) {
                names[j + 1] = names[j];
                j--;
            }
            names[j + 1] = current;
        }
    }

}

