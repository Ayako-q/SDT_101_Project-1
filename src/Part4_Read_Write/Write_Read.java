package Part4_Read_Write;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

// Part 4 and Part 5
public class Write_Read
{
    public static void main(String[] args)
    {
        boolean running = askUser();
        while (running)
        {
            BufferedReader reader = null;
            BufferedWriter writer = null;

            try
            {
                // Asking user to input his file name
                System.out.print("Enter the name of the input file: ");
                String inputFileName = new BufferedReader(new java.io.InputStreamReader(System.in)).readLine();

                // Open input and output files
                // reader
                reader = new BufferedReader(new FileReader(inputFileName));
                // writer that will create a .txt file
                writer = new BufferedWriter(new FileWriter(inputFileName + ".txt"));

                String line;
                int lineNum = 1;
                // while loop to go through lines of file and then write numbered lines
                while ((line = reader.readLine()) != null)
                {
                    writer.write(String.format("[%03d] %s%n", lineNum++, line));
                }

                System.out.println("\n\u001B[33mSuccessfully exported your file to: \n\n\u001B[0m" + " " + inputFileName + ".txt");
            }
            catch (IOException e)
            {
                System.out.println("\n\u001B[31mERROR, FILE NOT FOUND!\n\n\u001B[0m" + e);
            }
            finally {
                try {
                    // Close input and output files
                    if (reader != null) {
                        reader.close();
                    }
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            running = askUser();
        }
    }
    public static boolean askUser()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nYou want to continue further? Y/N\n");
        String userAnsw = scan.nextLine();
        if (userAnsw.toLowerCase().equals("y"))
        {
            return true;
        }
        else if (userAnsw.toLowerCase().equals("n"))
        {
            System.out.println("Sorry to hear that! Bye!");
            return false;
        }
        else
        {
            System.out.println("Sorry, but your answer is something different from Y/N, try again!");
            return askUser();
        }
    }
}
