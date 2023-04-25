public class parallelArrays {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d", "e"};

        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%d %s\n", intArray[i], stringArray[i]);
        }
    }
}
