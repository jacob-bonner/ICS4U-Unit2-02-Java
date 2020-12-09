/*
* This class creates an integer stack
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-07
*/

import java.util.ArrayList;  // Import the ArrayList class

public class JacobStack {
  // Initializing the array list field
  private ArrayList<Integer> _stackAsArray = new ArrayList<Integer>();

  /**
   * This method adds user input to a stack.
   */
  public void push(Integer inputNumber) {
    _stackAsArray.add(inputNumber);
  }

  /**
   * This method pops the item on top of the stack and returns it.
   */
  public Integer pop() {
    int poppedNumber = this._stackAsArray.get(_stackAsArray.size() - 1);
    _stackAsArray.remove(_stackAsArray.size() - 1);
    return poppedNumber;
  }

  /**
   * This getter tells the user the most recent itteration of the array.
   */
  public String currentStack() {
    String currentValues = "Current ArrayList: ";
    for (int counter = 0; counter < _stackAsArray.size(); counter++) {
      currentValues = currentValues + _stackAsArray.get(counter) + ", ";
    }
    return currentValues;
  }
}
