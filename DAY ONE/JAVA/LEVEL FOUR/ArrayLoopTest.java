import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayLoopTest{

    @Test
    public void testThatTheSumOfTwoNumbersInAnArrayCanAddUp(){
    int [] numbers = {2, 7, 11, 15};
    int target = 9;
    int [] result = {0,1};
    int[] actual = ArrayLoop.getNums(numbers);
    assertArrayEquals(actual, result);
