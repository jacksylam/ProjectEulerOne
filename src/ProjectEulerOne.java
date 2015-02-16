/**
 * Created by Jack on 2/1/2015.
 *
 * Finds the sum of the multiples of 3 or 5 below 1000.
 */
public class ProjectEulerOne {
  /**
   * Computes sum of multiples of 3 or 5 below 1000.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    double sum = computeSumOfMultiples(1000);
    System.out.println(sum);
  }

  /**
   * Computes sum of multiples of 3 or 5.
   * @param upperBound  Threshold.
   * @return Sum.
   */
  public static int computeSumOfMultiples(int upperBound) {
    int sum = 0;
    for (int i = 0; i < upperBound; i++) {
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
