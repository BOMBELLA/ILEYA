public class ArrayLoop{

    public static int [] getTwoNumsAddUp(int [] numbers, int target){

        int [] result = new int [2];

        for(int index = 0; index < numbers.length; index++){

            for(int inner = index+1; inner < numbers.length; inner++){

                if(numbers[index] + numbers[inner] == target){

                    result[0] = index;

                    result[1] = inner;
                }
            }
        }
        return result;
    }

}
