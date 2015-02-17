/**
 * Created by Jack on 2/1/2015.
 */
public class ProjectEulerOne {
  /**
   * Computes sum of multiples of 3 and 5 below 1000.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    double sum = computeSum(1000);
    System.out.println(sum);
  }

  /**
   * Computes sum of multiples of 3 and 5 below some bound.
   * @param upperbound Upperbound for numbers.
   * @return Sum of all the multiples.
   */
  public static int computeSum(int upperbound) {
    int sum = 0;
    for (int i = 0; i < upperbound; i++) {
      if (i % 3 == 0) {
        sum += i;
      }
      else if (i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
