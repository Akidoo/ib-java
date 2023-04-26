
public class BinarySearchString {

  public static void main(String[] args) {
    String[] strings = {"Kai", "Tobias", "Oliver", "Akaash", "Kamya"};
    String string_to_find = "Akaash";
    selectionSortString(strings);

    int index = binarySearch(strings, string_to_find);

    if (index == -1) {
      System.out.println("The string was not found.");
    } else {
      System.out.println("The string was found at index " + index);
    }
  }

  public static int binarySearch(String[] array, String string_to_find) {
    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (array[mid].equals(string_to_find)) {
        return mid;
      } else if (array[mid].compareTo(string_to_find) < 0) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1;
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
	}
    
}
}
