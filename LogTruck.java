/*
* This program tells the user how many logs of a 
* specific length a truck can carry.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-11-20
*/

import java.util.Scanner;  // Import the Scanner class

public class LogTruck {
  /**
   * This function tells the user the number of logs a truck can carry
   * based on the number the user inputs.
   */
  public static void main(String[] args) {

    // Input
    Scanner logInput = new Scanner(System.in);
    System.out.println("Enter the length of the log (in meters):");
    float lengthOfLogs = logInput.nextFloat();

    // Process
    float numberOfLogs = 1100 / (lengthOfLogs * 20);

    // Output
    System.out.println("The truck can carry " + numberOfLogs + " logs.");
  }
}
