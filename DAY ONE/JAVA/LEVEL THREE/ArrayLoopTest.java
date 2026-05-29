import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayLoopTest{

    @Test
    public void testThatAnArrayReturnsAnotherArrayOfASingleMergedLevel(){
    int [][] numbers = {{9, 0, 7}, {3, 5, 1}, {8, 1, 7}, {9, 9, 6}};
    int [] actual = ArraysCheck.mergeSort(numbers);
    int [] result = {9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6};
    assertArrayEquals(actual, result);
    }
