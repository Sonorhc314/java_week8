
/*
 * Implement the methods below.
 */ 

class Main {
  public static void main(String[] args) {
    Main object1 = new Main();
    System.out.println("Hello world!");
    System.out.println(object1.isModThree(3));
    System.out.println(object1.isModThree(10));
    System.out.println(object1.multiply(10,3));
    System.out.println(object1.fib(3));
  }

  // Method which returns true if a number is divisible by 3 and  
  // false if it is not.  Hint: use the modulo (%) operator.
  public boolean isModThree(int n){
    if(n%3==0)
    {return true;}
    return false;
  }

  // Recursive method which performs multiplication of two 
  // numbers without using the inbuilt * sign
  public int multiply(int n, int by){
      if (by < 0) {
      return 0 - multiply(n, 0 - by);
    } 
    else if (by == 1) {
      return n;
    }
    else if (by == 0) {
      return 0;
    }
    else {
      return n + multiply(n, by - 1);
    }
  }

  /*
   * Complete the fibonacci method below such that it calculates the 
   * nth term of the Fibonacci sequence using iteration.
   * 
   * The first 4 terms of the Fibonacci sequence in this example 
   * are  1, 1, 2, 3, 5, 8
   *
   * For example if we call fibonacci(1) we should get the value 1 returned,
   * if we call fibonacci(4) we should get the value 3 returned. 
   */
   public int fib(int term){
    int fibNum1 = 1;
    int fibNum2 = 1;
    int result = 1;
    for(int i=2; i<term; i++)
    {
        result = fibNum1+fibNum2;
        fibNum1 = fibNum2;
        fibNum2 = result;
        System.out.println(result);
        System.out.println(fibNum1);
        System.out.println(fibNum2);
        System.out.println();
    }
    return result;
   }
}