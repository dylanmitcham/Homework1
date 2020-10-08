package cse360assignment02; // package

public class AddingMachine 
{
  private int total;
  
  public AddingMachine () // default constructor class
  {
    total = 0;   // not needed - included for clarity
  }
  
  public int getTotal () // method that returns the total
  {
    return 0; // this method wouldn't work because it returns the integer 0 instead of the integer stored in the variable named total
  }
  
  public void add (int value) // currently empty method that takes in an integer and adds it to the total of the AddingMachine class object
  {
  }

  public void subtract (int value) // currently empty method that takes in an integer and subtracts it from the total variable of the AddingMachine class object
  {
  }

  public String toString () // method that returns the value of the total variable in the class object as a string 
  {
    return ""; // this would simply return an empty string, not the total of the object represented as a string
  }

  public void clear() // empty method that should set the total back to 0 
  {
  }
}