import java.util.Scanner;

public class Test {
    public static Scanner input = new Scanner(System.in);

    public static int power(int base, int exponent) {
        int result = base;
        for(int i = 1; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int findLength(int x) {
        int length = 0;
        while(x != 0) {
            x /= 10;
            length++;
        }
        return length;
    }

    public static int findMaxLength(int[] a) {
        int maxLength = -1;
        for(int i = 0; i < a.length; i++) {
            int length = findLength(a[i]);
            if(length > maxLength) {
                maxLength = length;
            } 
        }
        return maxLength;
    }

    public static String generateSpaces(int spaces) {
        String result = "";
        for(int i = 0; i < spaces; i++) {
            result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Akaash Banerjee");
        System.out.println("Please input a positive number less than 10:");
        int x = input.nextInt();

        while( x >= 10 || x < 1) {
            System.err.println("Error: Invalid input.");
            System.out.println("Please input a positive number less than 10:");
            x = input.nextInt();
        } 

        int[] bases = new int[x];
        int[] powers = new int[x];
        int[] squares = new int[x];

        for(int i = 0; i < x; i++) {
            bases[i] = i+1;
            squares[i] = power(i+1, 2);
            powers[i] = power(x, i+1);
        }

        for(int i = 1; i <= x; i++) {
            int base = bases[i-1];
            int maxBaseLength = findMaxLength(bases);
            int baseLength = findLength(base);
            String baseSpaces = generateSpaces(maxBaseLength - baseLength);

            int square = squares[i-1];
            int maxSquareLength = findMaxLength(squares);
            int squareLength = findLength(square);
            String squareSpaces = generateSpaces(maxSquareLength - squareLength);

            int power = powers[i-1];
            int maxPowerLength = findMaxLength(powers);
            int powerLength = findLength(power);
            String powerSpaces = generateSpaces(maxPowerLength - powerLength);

            System.out.println(baseSpaces + base + " " + squareSpaces + square + " " + powerSpaces + power);
        }
    }
}