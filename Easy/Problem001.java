//   Problem001.java
//   This problem was recently asked by Google.
//   Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//   For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//   Bonus: Can you do this in one pass? */

package Easy;

public class Problem001 {
  public static void main(String[] args) {
    int[] numbers = new int[]{ 10, 11, 15, 3, 8, 15, 9 };
    int k = 17;

    System.out.println(solver(numbers, k));
  }

  public static boolean solver(int[] numbers, int k) {
    boolean result = false;
    
    for (int i = 0; i < numbers.length; i++) {
      //System.out.print(numbers[i] + " ");
      for (int j = i+1; j < numbers.length; j++) {
        //System.out.println(i + " " + j);
        if (numbers[i] + numbers[j] == k) { result = true; }
      }
    }

    return result;
  }
}
