package Part1;

/*
SDT 101
Part 1 - arrays
Oleksii Ishchenko Project 1
*/
public class Arrays {
    public static void main(String[] args) {
        int[][] ar1 = new int[5][5]; // Creating a new array with 5 rows and columns
        // If it is necessarily, I can make an array creation inside my methods, or in separate method
        // Below I call my methods to fill my array with different patterns:
        arrayInit1(ar1);
        arrayInit2(ar1);
        arrayInit3(ar1);
        arrayInit4(ar1);
        arrayInit5(ar1);
    }

    // Part 1 CODE:
    public static void printArray(int[][] ar1) { // a static method to print an array with 5 rows and 5 columns
        for (int i = 0; i < 5; i++) { // going through rows
            for (int j = 0; j < 5; j++)  // going through columns
            {
                System.out.print(ar1[i][j] + " ");
                if (j == 4) {
                    System.out.print("\n"); // if this is the end of the column - print a new line
                }
            }
        }
    }

    public static void arrayInit1(int[][] ar1) // a static method to fill an array with all 5 and then print it
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                ar1[i][j] = 5;
            }
        }
        System.out.println("\nInitialisation 1 (required) :\n");
        printArray(ar1);
    }

    public static void arrayInit2(int[][] ar1) // a static method to fill an array with 0 1 2 3 4 pattern
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                ar1[i][j] = j;
            }
        }
        System.out.println("\nInitialisation 2 (required) :\n");
        printArray(ar1);
    }

    public static void arrayInit3(int[][] ar1) // a static method to fill an array with 0 1 2 3 4 pattern
    {
        int number = 0;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                ar1[i][j] = number;
                number++;
            }
        }
        System.out.println("\nInitialisation 3 (optional) :\n");
        printArray(ar1);
    }

    public static void arrayInit4(int[][] ar1) // a static method to fill an array with 0 1 2 3 4 pattern
    {
        int number = 0;
        for (int i = 0; i < 5; i++)
        {
            number = number + 5;
            for (int j = 0; j < 5; j++)
            {
                number--;
                ar1[i][j] = number;
                if (j == 4){ // if we've reached the end of the line - add 5 to the number
                    number = number + 5;
                }
            }
        }

        System.out.println("\nInitialisation 4 (optional) :\n");
        printArray(ar1);
    }
    public static void arrayInit5(int[][] ar1) // a static method to fill an array with 0 1 2 3 4 pattern
    {
        int number = 25;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                number--;
                ar1[i][j] = number;
            }
        }
        System.out.println("\nInitialisation 5 (optional) :\n");
        printArray(ar1);
    }
}