/*
 * Implement below a method (or methods) which allows the user to
 * type in their name, age and height in cm and prints to the terminal
 * their name, age, year of birth and height in feet and inches.
 * 
 * For example, you might print out, 
 *
 * "Hello <name>, you are <age> and were born in <year>. 
 * You are <?> feet and <?> inches tall"
 */
import java.util.Scanner;
// import javafx.util.Pair;

class Main {
  public static void main(String[] args) {
    Main object = new Main();
    
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username: ");
    String userName = myObj.nextLine();  // Read user input
    
    System.out.println("Enter age: ");
    
    int userAge = myObj.nextInt();

    System.out.println("Enter height in cm: ");
    float userHeight = myObj.nextFloat();  // Read user input
    
    MyResult result = object.cm_to_inches(userHeight);
    // float userHeight_feet = object.cm_to_feet(userHeight);
    // float userHeight_inches = object.cm_to_inches(userHeight);

    System.out.printf("Hello %s, you are %d and were born in year %d.", userName, userAge, userAge);
    System.out.printf("You are %d feet and %.3f inches tall.", (int)(result.getFirst()), result.getSecond() );
  }


  public MyResult cm_to_inches(float value)
  {
    float feet = (float)(value/30.48);
    int feet_int = (int)(value/30.48);
    float inches = (float)((feet-feet_int)*12);
    return new MyResult(feet, inches);
  }

  final class MyResult {
    private final float first;
    private final float second;

    public MyResult(float first, Float second) {
        this.first = first;
        this.second = second;
    }
    public float getFirst() {
        return first;
    }

    public float getSecond() {
        return second;
    }
  }
}