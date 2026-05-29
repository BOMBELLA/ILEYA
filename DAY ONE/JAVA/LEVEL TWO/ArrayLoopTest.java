import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayLoopTest{

    @Test
    public void testThatAnArrayReturnsDuplicateNumbers(){
    int [] numbers = {1, 2, 3, 2, 4, 3};
    int [] actualResult = ArrayLoop.duplicateNumber(numbers);
    int [] expectedResult = {2,3};
    assertArrayEquals(actualResult, expectedResult);
    }
    
    @Test
    public void testThatAllZerosInAnArrayMovesToTheEnd(){
    int [] numbers = {5, 0 , 3, 0, 2, 0};
    int [] actualResult = ArrayLoop.sort(numbers);
    int [] expectedResult = {5, 3 , 2 , 0, 0 , 0};
    assertArrayEquals(actualResult, expectedResult);
