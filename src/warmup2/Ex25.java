package warmup2;

public class Ex25 {


// Given an array of ints, return true if it contains a "2, 7, 1" pattern:
// a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
// even if the "1" differs by 2 or less from the correct value
    public boolean has271(int[] numbers){

        int temp;

        for (int i = 0; i < numbers.length - 2; i++){
            if (numbers[i] + 5 == numbers[i+1]){
                temp = numbers[i] - numbers[i+2];
                if (temp <= 3 && temp >= -1){
                    System.out.println(true);
                    return true;
                }
            }
        }
        System.out.println(false);
        return false;
    }
}
