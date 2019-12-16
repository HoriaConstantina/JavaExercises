package warmup2;

public class Ex15 {

    public int last2(String string) {

     String end = string.substring(string.length() - 2);
     int count = 0;

     for (int i = 0; i < string.length()-2; i++) {
         String sub = string.substring(i, i+2);
         if (sub.equals(end)) {
             count++;
         }
     }

     System.out.println(count);
     return count;
    }
}
