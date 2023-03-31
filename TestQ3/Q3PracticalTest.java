
public class Q3PracticalTest
{
    // global variables and constants
    final static int MAXSIZE = 10;
    static int population = 0;

    public static boolean isFull(String[] a)
    {
		boolean full = true;
		return population == MAXSIZE;
}

    public static boolean isEmpty(String[] a)
    {
		
		return population == 0;
		
  }
          

    

    public static void printArray(String[] a)
    {
		int index = 0;
        for(int i = 0; i<a.length; i++){
			if(a[i] != null){
			index = index+1;
			System.out.print(i + ":" + a[i] + " ");
		}
				
		}
		System.out.println("[population: " + index + "]");
    }

    public static void printWholeArray(String[] a)
    {
		
		for(int i = 0; i<a.length; i++){
			System.out.print(i + ":" + a[i] + " ");
				
		}
		System.out.println("[length: " + a.length + "]");
    }

    public static String[] clone(String[] a)
    {
        String[] cloneArray = new String[a.length];
        for(int i = 0; i<cloneArray.length; i++){
        cloneArray[i] = a[i];
	}
        return cloneArray;
    }

    public static void add(String[] a, String data)
    {
		if(isFull(a)){
			System.out.println("Error - array full");
		}
		else {
			a[population] = data;
			population++;
		}
		printArray(a);
    }

    public static int search(String[] a, String data)
    {
		int index = 0;
        for(int i = 0; i<a.length; i++){
			if(data == a[i]){
			index = 1;
			break;
		}
		else{
			index = -1;
			
			}
		}
        return index;
    }

    public static void swap(String[] a, int index1, int index2)
    {
		// your code!
    }

    public static void replace(String[] a, String original, String replacement)
    {
        // your code!
    }

    public static void remove(String[] a, String data)
    {
		String deletion = data;
		int currentSize = a.length+1;
		for(int i = 1; i<currentSize-1; i++){
			if(a[i] == deletion) {
				
				a[i] = a[a.length-1];
				currentSize = currentSize-1;
				
				
				
				}
			}
			for(int f = 0; f<currentSize-1; f++){
			System.out.println(a[f]);
		
		
		}
    }

    public static void insert(String[] a, String data, int index)
    {
		// your code!
    }

	// Do not modify the code below this line--------------------------------------------------------------------------
    public static void main(String[] args)
    {
        String[] arr = new String[MAXSIZE];
        System.out.println("1. printWholeArray + length:\n   Expected output >>> 0:null  1:null  2:null  3:null  4:null  5:null  6:null  7:null  8:null  9:null  [ length: 10 ]");
        System.out.print("   Y O U R  output >>> "); printWholeArray(arr);
        System.out.println("\n2. printArray + population:\n   Expected output >>> [ population: 0 ]");
        System.out.print("   Y O U R  output >>> "); printArray(arr);
        System.out.println("\n3. Testing isFull()  method [false] >>> " + isFull(arr));
        System.out.println("   Testing isEmpty() method [true]  >>> " + isEmpty(arr));
        System.out.println("\n4. Testing the add() method...");
        add(arr, "apple");
        add(arr, "banana");
        add(arr, "cherry");
        add(arr, "dragonfruit");
        add(arr, "elderberry");
        add(arr, "fig");
        add(arr, "gooseberry");
        add(arr, "imbe");
        add(arr, "jujube");
        add(arr, "kiwi");
        System.out.print("   Output should be: Error adding longan >>> ");
        add(arr, "longan");
        System.out.println("   Expected output >>> 0:apple  1:banana  2:cherry  3:dragonfruit  4:elderberry  5:fig  6:gooseberry  7:imbe  8:jujube  9:kiwi  [ population: 10 ]");
        System.out.print("   Y O U R  output >>> ");
        printArray(arr);
        System.out.println("\n5. Test search(arr, \"banana\") method [1]: " + search(arr, "banana"));
        System.out.println("   Test search(arr, \"grape\") method [-1]: " + search(arr, "grape"));
        String[] full = clone(arr);
        System.out.println("\n6. Testing clone method String[] full = clone(arr); [false]: " + arr.equals(full));
        System.out.println("\n7. Testing remove(arr, \"dragonfruit\"); remove(arr, \"gooseberry\"); - output should be as below:");
        remove(arr, "dragonfruit");
        remove(arr, "gooseberry");
        System.out.print("   Testing remove(arr, \"watermelon\") should output error: watermelon not found >>> ");
        remove(arr, "watermelon");  
        System.out.println("8. Testing swap(arr, 0, 5);");
		swap(arr, 0, 5);
        System.out.println("   Testing swap(arr, 3, 10); swap(arr, -3, 1); this should generate two errors >>>");
        System.out.print("   "); swap(arr, 3, 10);
        System.out.print("   "); swap(arr, -3, 1);
        System.out.println("   Expected output >>> 0:fig  1:banana  2:cherry  4:elderberry  5:apple  7:imbe  8:jujube  9:kiwi  [ population: 8 ] (printArray)");
        System.out.print("   Y O U R  output >>> "); printArray(arr);
        System.out.println("\n9. Testing replace(arr, \"apple\", \"papaya\") ");
        replace(arr, "apple", "papaya");
        System.out.println("   Expected output >>> 0:fig  1:banana  2:cherry  3:null  4:elderberry  5:papaya  6:null  7:imbe  8:jujube  9:kiwi  [ length: 10 ] (printWholeArray)");
        System.out.print("   Y O U R  output >>> ");
        printWholeArray(arr);
        System.out.print("   Testing replace(arr, \"watermelon\", \"apple\") should output error: watermelon not found >>> ");
        replace(arr, "watermelon", "apple");
        System.out.println("\n10. Testing insert(arr, \"plum\", 0) ");
        insert(arr, "plum", 0);
        System.out.println("    Expected output >>> 0:plum  1:banana  2:cherry  3:fig  4:elderberry  5:papaya  6:null  7:imbe  8:jujube  9:kiwi  [ length: 10 ] (printWholeArray)");
        System.out.print("    Y O U R  output >>> ");
        printWholeArray(arr);
        System.out.print("    Testing insert(arr, \"mango\", 11) should output an error >>> ");
        insert(arr, "mango", 11);
        

    }


    //===========================================================
    // IBIO Standard Input and Output
    //  These methods must be copied into your program(s).
    //===========================================================

    static void output(String info)
    {
        System.out.println(info);
    }

    static void output(char info)
    {
        System.out.println(info);
    }

    static void output(byte info)
    {
        System.out.println(info);
    }

    static void output(int info)
    {
        System.out.println(info);
    }

    static void output(long info)
    {
        System.out.println(info);
    }

    static void output(double info)
    {
        System.out.println(info);
    }

    static void output(boolean info)
    {
        System.out.println(info);
    }

    static String input(String prompt)
    {
        String inputLine = "";
        System.out.print(prompt);
        try
        {
            inputLine = (new java.io.BufferedReader(
                    new java.io.InputStreamReader(System.in))).readLine();
        } catch (Exception e)
        {
            String err = e.toString();
            System.out.println(err);
            inputLine = "";
        }
        return inputLine;
    }

    static String inputString(String prompt)
    {
        return input(prompt);
    }

    static String input()
    {
        return input("");
    }

    static int inputInt()
    {
        return inputInt("");
    }

    static double inputDouble()
    {
        return inputDouble("");
    }

    static char inputChar(String prompt)
    {
        char result = (char) 0;
        try
        {
            result = input(prompt).charAt(0);
        } catch (Exception e)
        {
            result = (char) 0;
        }
        return result;
    }

    static byte inputByte(String prompt)
    {
        byte result = 0;
        try
        {
            result = Byte.valueOf(input(prompt).trim()).byteValue();
        } catch (Exception e)
        {
            result = 0;
        }
        return result;
    }

    static int inputInt(String prompt)
    {
        int result = 0;
        try
        {
            result = Integer.valueOf(
                    input(prompt).trim()).intValue();
        } catch (Exception e)
        {
            result = 0;
        }
        return result;
    }

    static long inputLong(String prompt)
    {
        long result = 0;
        try
        {
            result = Long.valueOf(input(prompt).trim()).longValue();
        } catch (Exception e)
        {
            result = 0;
        }
        return result;
    }

    static double inputDouble(String prompt)
    {
        double result = 0;
        try
        {
            result = Double.valueOf(
                    input(prompt).trim()).doubleValue();
        } catch (Exception e)
        {
            result = 0;
        }
        return result;
    }

    static boolean inputBoolean(String prompt)
    {
        boolean result = false;
        try
        {
            result = Boolean.valueOf(
                    input(prompt).trim()).booleanValue();
        } catch (Exception e)
        {
            result = false;
        }
        return result;
    }
	//=========== end IBIO ===========================================//

}

