/*
* This program pushes a user inputted integer to a stack
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-07
*/

import java.util.Scanner;  // Import the Scanner class

public class StackForm {
  /**
   * This function allows the user to add an inputted number to a stack.
   */
  public static void main(String[] args) {
    // Declaring stack by using the JacobStack class
    JacobStack stack = new JacobStack();

    try {
      // User input for size of stack
      Scanner stackInput = new Scanner(System.in);
      System.out.println("How many integers would you like for the stack: ");
      int stackSize = stackInput.nextInt();
      System.out.println();

      for (int counter = 0; counter < stackSize; counter++) {
        // User input for integer to be added to stack
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an Integer for the Stack: ");
        int numberChosen = userInput.nextInt();
        System.out.println();

        // Placing the inputted integer on the stack
        stack.push(numberChosen);
      }

      // Popping the most recent integer and returning it to the user
      System.out.println("Number Popped From ArrayList: " + stack.pop());

      // Printing the current values in the stack
      System.out.println(stack.currentStack());

      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    }
  }
}
