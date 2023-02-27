
import java.util.Arrays;

public class Main {
	
	public static void main (String[] names) {
		int[] num = {8,3,1,5,7};
		var sorter = new insertionSort();
		sorter.sort(num);
		System.out.println(Arrays.toString(num));
	}
}

