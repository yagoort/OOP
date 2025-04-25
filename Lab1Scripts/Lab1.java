import java.util.Random;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int arrayLength;

        do { 
            System.out.println("Please input a fixed length for the array between 1-12: ");
            arrayLength = scanner.nextInt();
            System.out.println("\n");

        } while (arrayLength > 12 || arrayLength < 1);
        
        // Array A creation and printing section: 
        int[] arrayA = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Input element #" + (i+1));
            arrayA[i] = scanner.nextInt();
            System.out.println("\n");
        }
        System.out.println("ArrayA: ");
        printArray(arrayA);
        // End Array A section 

        // Array B creation and printing section:
        int[] arrayB = new int[arrayLength];

        int min = 1;
        int max = 20;

        int newRandomValue;
        for (int i = 0; i < arrayLength; i++) {
            newRandomValue = random.nextInt(min, max + 1);
            arrayB[i] = newRandomValue;
        }
        System.out.println("ArrayB: ");
        printArray(arrayB);
        // End Array B section

        // Sum of Arrays A and B 
        int[] sumArrays = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            sumArrays[i] = arrayA[i] + arrayB[i];
        }
        System.out.println("Sum of arrays: ");
        printArray(sumArrays);
        // End Sum of Arrays A and B section 

        // Dot product 
        int dotProduct = 0;
        for (int i = 0; i < arrayLength; i++) {
            dotProduct += (arrayA[i] * arrayB[i]);
        }

        System.out.println("Dot product: " + dotProduct);
        System.out.println("\n");
        // End section

        // Sum of pairs 
        int sumPairs = 0; 
        for (int i = 0; i < arrayB.length; i++) {
            if (arrayA[i] % 2 == 0) sumPairs += arrayA[i]; 
        }

        System.out.println("Sum of pairs: " + sumPairs);
        System.out.println("\n");
        // End section 

        // Average of B 
        double averageOfB = 0; 
        for (int i = 0; i < arrayB.length; i++) {
            averageOfB += (double) arrayB[i];
        }
        averageOfB /= arrayB.length;

        System.out.println("Average of B: " + averageOfB);
        System.out.println("\n");
        // End section 

        // Array C creation 
        int arrayClength = (2*arrayLength);
        int[] arrayC = new int[arrayClength];

        for (int i = 0; i < arrayLength; i++) {
            int pairIndex = 2*i;
            int oddIndex = 2*i + 1;
            arrayC[pairIndex] = arrayA[i];
            arrayC[oddIndex] = arrayB[i];
        }
        System.out.println("ArrayC: ");
        printArray(arrayC);
        System.out.println("\n");
        // End Section 

        // Max value of C & Index
        int maxValueOfC = 0;
        for (int num : arrayC) {
            if (num > maxValueOfC) maxValueOfC = num;
        }
        int indexOfMax = indexOfValue(maxValueOfC, arrayC);
        System.out.println("The Maximum value of C is :" + maxValueOfC + " at index :" + indexOfMax);
        System.out.println("\n");
        // End Section
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println("\n");
    } 

    public static int indexOfValue(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }
}