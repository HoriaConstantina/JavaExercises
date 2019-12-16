package warmup2;

public class Ex13 {

    public String stringBits(String str) {

        int len = str.length();
        StringBuilder stringBuilder = new StringBuilder(len+1);

        for (int i = 0; i < len; i+=2) {
            stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
