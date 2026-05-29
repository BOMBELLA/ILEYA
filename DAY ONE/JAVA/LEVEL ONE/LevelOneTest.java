import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LevelOneTest{

    @Test
    public void testThatAnArrayCanBeSplitIntEvenAndOdd(){
    int [] numbers = {45, 60, 3, 10, 9, 22};
    int [][] actualValue = ArrayLoop.evenAndOdd(numbers);
    int [][] result = {{45, 3, 9}, {60, 10, 22}};
    assertArrayEquals(actualValue, result);
    }
    
    
    
    @Test
    public void testThatAnArrayReturnsAPerfectSquare(){
    int [] array = {4, 7, 9, 10, 16, 18};
    int[] actualValue = ArrayLoop.perfectSquare(array);
    int [] result = {4, 9, 16};   
    assertArrayEquals(actual, result);
    }
    
    @Test
    public void testThatAnArrayReturnsANonPerfectSquare(){
    int [] number = {4, 7, 9, 10, 49, 6};
    int[] actualValue = ArrayLoop.nonPerfectSquare(number);
    int [] result = {4, -1, 9, -1, 49 , -1};
    assertArrayEquals(actual, result);
    }   















}    
