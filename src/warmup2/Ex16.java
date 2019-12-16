package warmup2;

public class Ex16 {

    public int arrayCount9(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9){
                count++;
            }
        }

        System.out.println(count);
        return count;
    }
}
