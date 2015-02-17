import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for Project Euler One.
 */
public class ProjectEulerOneTest {

  /**
   * Tests computeSum for multiples of 3 and 5.
   * @throws Exception Exception if sum is not correct.
   */
  @Test
  public void testComputeSum() throws Exception {
    assertEquals("testing below 10", 23, ProjectEulerOne.computeSum(10));
    assertEquals("testing below 20", 78, ProjectEulerOne.computeSum(20));
  }
}