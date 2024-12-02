import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();
        
        // Declare variables for Fibonacci series
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series up to " + numTerms + " terms:");

        // Print the Fibonacci series up to the number of terms specified by the user
        for (int i = 1; i <= numTerms; ++i) {
            // Print the current term
            System.out.print(firstTerm + " ");
            
            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        // Close the scanner

