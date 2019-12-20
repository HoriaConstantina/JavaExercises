package warmup2;

public class Ex23 {


// Given an array of ints, return the number of times that two 6's are next to each other in the array.
// Also count instances where the second "6" is actually a 7.
    public int array667(int[] numbers){

        int count = 0;
        for (int i = 1; i < numbers.length; i++){
            if ((numbers[i] == 7 || numbers[i] == 6) && numbers[i-1] == 6){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
