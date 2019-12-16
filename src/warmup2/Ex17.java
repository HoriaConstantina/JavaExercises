package warmup2;

public class Ex17 {

    public boolean arrayFront9(int[] nums) {

          for (int i = 0; i < nums.length; i++) {
              if (i <= 4 && nums[i] == 9){
                  System.out.println(true);
              }
              else {
                  System.out.println(false);
              }
          }
          return true;
    }
}
