import java.util.Arrays;

public class LevelOne{

       public static int getEvenAndOddOf(int [] numbers){

        int odd = 0;

        int even = 0;

       for(int index= 0; index < numbers.length; index++){

        if(numbers[index] % 2 == 0){

              even++;

       if(nubers[index] % 2 != 0){

              odd++;

              }
              


              }
              }

        return even;
    }  



public static int [] perfectSquare(int [] array){

        int count = 0;
        for(int index = 0; index < array.length; index++){
            int squareRoot = (int)Math.sqrt(array[index]);
            if(squareRoot * squareRoot == array[index]){
                count++;
            }            
        }
        int [] result = new int [count]; 
        int counter = 0;
        for(int index = 0; index < array.length; index++){
            int squareRoot = (int)Math.sqrt(array[index]);
            if(squareRoot * squareRoot == array[index]){
                result[counter] = array[index];
                counter++;
            }            
        }        
        
        return result;
    }
    
    public static int [] nonPerfectSquare(int [] number){
        
        for(int index = 0; index < number.length; index++){
            int squareRoot = (int)Math.sqrt(number[index]);
            if(squareRoot * squareRoot != number[index]){
            number[index] = -1;
            }            
        }
        return number;
    }








































}










