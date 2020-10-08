package cse360assignment02; // package

public class AddingMachine 
{
  private int total; // stores current total integer value 
  private String result; // string variable used to store history of user input for use in the toString method
  
  public AddingMachine () // default constructor class
  {
	result = "0";
    total = 0;   // not needed - included for clarity
  }
  
  public int getTotal () // method that returns the total
  {
    return total; // simply return total variable
  }
  
  public void add (int value) // method that takes in an integer and adds it to the total value of the AddingMachine class object
  {
	  result = result + " + " + value;
	  total = total + value;
  }

  public void subtract (int value) // method that takes in an integer and subtracts it from the total variable of the AddingMachine class object
  {
	  result = result + " - " + value;
	  total = total - value;
  }

  public String toString () // method that returns a string of every input and the operations between them i.e "0 - 2 + 1" would be printed if the user subracted 2 and then added 1 to the default total of 0
  {
    return result; // result is a string which is initialized as "0" but is incremented each time the add or subtract method is used so that it shows the user's input in chronological order 
  }
  
  public void clear() // reverts total value back to 0
  {
	  result = result + " -cleared- 0"; // i added this code so that the toString method shows that the total was cleared
	  total = 0;
  }
}