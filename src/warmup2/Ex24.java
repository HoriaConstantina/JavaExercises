package warmup2;

public class Ex24 {


// Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
// Return true if the array does not contain any triples.

    public boolean noTriples(int[] numbers){

        for (int i = 0; i < numbers.length - 2; i++){
            if (numbers[i] == numbers[i+1] && numbers[i] == numbers[i+2]){
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }
}
