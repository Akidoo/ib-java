
public class BinarySearchString {

  public static void main(String[] args) {
    String[] strings = {"Kai", "Tobias", "Oliver", "Akaash", "Kamya"};
    String string_to_find = "Akaash";

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
}
