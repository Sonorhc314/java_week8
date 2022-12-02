import java.util.*;

/*
 * Implement the methods marked with a * in the comments below.  
 * 
 * You can test your implementations by calling them from 
 * the main method,
 * 
 * e.g. double[] newArray = m.convertIntArray(exampleArray);
 *      m.printArray(newArray);
 */

class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.printArray(new double[]{1.3,2.3,3.3,4.3});
    m.printArray(new int[]{1,2,3,4});
    
    int[] exampleArray = new int[]{1,2,3,4};
    int[] exampleArray2 = new int[]{1,2,3,4};
    double[] newArray = m.convertIntArray(exampleArray);
    ArrayList<Integer> listarray = m.convertIntArrayToArrayList(exampleArray2);

    m.printArray(newArray);
    m.printArrayList(listarray);
  }

  // * - method to convert an array of ints to an array of doubles 
  public double[] convertIntArray(int[] array){
    double[] doubles = new double[array.length];
    for(int i=0; i<array.length; i++)
    {
      doubles[i] = array[i];  
    }
    return doubles;
  }

  // * - method to convert an array of ints to an ArrayList 
  public ArrayList<Integer> convertIntArrayToArrayList(int[] array){
    ArrayList<Integer> list1 = new ArrayList<Integer>(array.length);
    for(int i=0; i<array.length; i++)
    {
      list1.add(Integer.valueOf(array[i]));  
    }
    return list1;
  }

  // ---------------------------------------------------
  // helpful methods to print arrays of different types
  // ---------------------------------------------------
  public void printArray(int[] array){
    System.out.print("[");
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
  }

  public void printArray(double[] array){
    System.out.print("[");
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
  }

  public void printArrayList(ArrayList array){
    System.out.print("[");
    for(int i=0; i<array.size(); i++){
      System.out.print(array.get(i) + " ");
    }
    System.out.println("]");
  }
}