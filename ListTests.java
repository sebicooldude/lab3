import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
public class ListTests {
    @Test 
	public void testMerge() {
    List<String> input1 = new ArrayList<>();
    List<String> input2 = new ArrayList<>();
    List<String> output = new ArrayList<>();
    input1.add("a");
    input1.add("c");
    input2.add("b");
    input2.add("d");
    output.add("a");
    output.add("b");
    output.add("c");
    output.add("d");
    assertEquals(output, ListExamples.merge(input1, input2));
	}
}
