/*
 * 
 * TOH.java
 * 
 * Purpose: 
 *  Present the user with the solution to the Tower of Hanoi game, where you have to move a tower of disk to another stick, one disk at a time. 
 * 
 * Input:
 *  Prompts users to input the number of disk they want to know the solution to.
 * 
 * Output:
 *  Program prints out the solution for the user based on the number of disks the latter inputted.
 * 
 * Error Handling:
 *  Before solution starts, the user input is checked if it is an integer, if not the user will be asked again to make another input.
 * 
 * 
 * Additional Notes:
 * - This program create a new file or open an existing one using the 'FileWriter' class and the 'BufferedWriter'class
 * - This program uses the 'write()' method to write the solution string to the file.
 * - In the methods, check if the number of discs is 1. If it is, simply move the disc from the first_pole to the second_pole and return.
 * - If the number of disks is greater than 1, use recursion to move the top n-1 disks from the first_pole to the third_pole.
 * - Move the last remaining disk from the first_pole to the second_pole.
 * - This program uses recursion to move the n-1 disks from the third_pole to the second_pole.
 * 
 * @author      John Angelo A. Basilio
 * @author      Dhan Micheal L. Tamparong
 * @author      Robbie Christian Emmanuel E. Espaldon
 * @version     1.0
 * @since       2023-01-26
 */

// Instantiation
import java.io.*;
import java.util.*;
import java.lang.Math;

public class ToH {

        // For counting the number of steps the program makes to finish ToH.
        static int movesMade = 1;

        public static void main(String[] args) throws IOException {
                Scanner sc = new Scanner(System.in);

                // Prints out the name of the program and the rules to the game ToH.
                System.out.println("<Tower of Hanoi Solution> \nThe rules are:");
                System.out.println("(1) You can only move one disk at a time. \n(2) You cannot place a bigger disk onto a smaller one.\n(3) You can only move one disk.\n");

                // Prompts the user to input the desired number of disks and attaches it to the "numDisk" variable.
                System.out.print("Enter the number of disk(s): ");

                // Validates user input. If input is not an integer, it loops until an integer is entered.
                while (!sc.hasNextInt()) {
                        System.out.println("Invalid input! Please enter a number.\n");
                        sc.next();
                        System.out.print("Enter the number of disk(s): ");
                }

                // numDisk variable.
                int numDisk = sc.nextInt();

                // Prints the line below, factoring user input.
                System.out.println("\nThe solution to a " + numDisk + " disk TOH is:");

                // Calls the "towerOfHanoi" method
                towerOfHanoi(numDisk, 'A', 'B', 'C');
                
                // Prints out the solution as to how many moves one needs to make to solve ToH.
                double powerOf = (Math.pow(2, numDisk) - 1);
                System.out.println("\nWhy did it have " + powerOf + " moves?");

                // Prints out the formula in the terminal for users to see.
                System.out.println("Because the amount of moves is to be determined by 2^n-1 or 2 to the power of 'n'/amount of disks, minus 1");
                
                FileWriter fw = new FileWriter("TowerOfHanoi_Results.txt");
                BufferedWriter bw = new BufferedWriter(fw);

                // Writing into a txt file in the same folder.
                bw.write("Number of disks: " + numDisk + "\n");
                bw.write("Number of moves made: " + movesMade + "\n");
                bw.write("Formula: 2^n - 1: " + powerOf + " moves" + "\n");
                
                // Closes the file.
                bw.close();
                // Closes the scanner.
                sc.close();
        }

        // Recursive method
        public static void towerOfHanoi(int numDisk, char rodA, char rodB, char rodC) {

                if (numDisk == 1) {

                        System.out.println("<" + movesMade + "> Move disk (1) from rod [" + rodA + "] to rod {"+ rodC + "}");

                        // movesMade is the variable used to track how many moves has been made, this is for readabilty.
                        movesMade++;

                } else {
                        towerOfHanoi(numDisk - 1, rodA, rodC, rodB);

                        // Prints out based on the variable change. from rod[A] to rod[C] in the code, but in print it is [B].
                        System.out.println("<" + movesMade + "> Move disk (" + numDisk + ") from rod [" + rodA + "] to rod {" + rodC + "}");
                        movesMade++;

                        // Factors in the change and calls the method again. from rod[A] to rod[C] in the code, but in print its rod[C] to rod[B]
                        towerOfHanoi(numDisk - 1, rodB, rodA, rodC);
                }
        }
}
// Unfinished comments
