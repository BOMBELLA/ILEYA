public class ArrayLoop{


    public static int[] mergeSort(int[]numbers){


        int count = 0;

        for(int index = 0; index < numbers.length; index++){

            for(int inner = 0; inner < numbers[index].length; inner++){
                count++;
            }
        }
        int [] mergeSort = new int [count];

        int counter = 0;

        for(int index = 0; index < numbers.length; index++){

            for(int inner = 0; inner < numbers[index].length; inner++){

                mergedSort[counter] = numbers[index][inner];
                counter++;
            }
        }
        return mergedSort;
    }
