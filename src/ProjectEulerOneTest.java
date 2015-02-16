import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Project Euler One test class.
 */
public class ProjectEulerOneTest {
  /**
   * Tests sumOfMultiplies with 10 and 20.
   * @throws Exception If computations are wrong.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("tests below 10", 23, ProjectEulerOne.computeSumOfMultiples(10));
    assertEquals("tests below 20", 78, ProjectEulerOne.computeSumOfMultiples(20));
  }
}