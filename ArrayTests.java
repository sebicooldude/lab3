import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {5, 6, 7};
    int[] output1 = {7, 6, 5};
    assertArrayEquals(output1, ArrayExamples.reversed(input1));
  }
  @Test
  public void avwithoutlowest() {
    double[] input = {10, 20, 40, 60};
    double output = 40;
    assertEquals(output, ArrayExamples.averageWithoutLowest(input), 0.1);
  }
}
