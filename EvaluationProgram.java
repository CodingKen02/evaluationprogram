/*
 * Name: Kennedy Keyes
 * Date: April 25, 2021
 * Name of Program: EvaluationProgram.java
 * Description: This program will prompt the user for input and output a 
sentence based on the evaluated expression.
 */
package evaluationprogram;
import java.util.Scanner;
/**
 *
 * @author codingken
 */
public class EvaluationProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Scanner 
        Scanner input = new Scanner(System.in);
        
        // declare variables
        int num1;
        
        // prompt the user to enter an integer
        System.out.print("Please enter an integer: ");
        num1 = input.nextInt();
        
        // if greater than 10, print this statement
        if (num1 > 10) {
            System.out.println("You're a superstar! Great job!");
        }
        // if less than 10, print this statement
        else if (num1 < 10) {
            System.out.println("I think you can do better than that.");
        }
        // if equal to 10, print this statement
        else {
            System.out.println("You did pretty good. Good work.");
        }
    }  
}