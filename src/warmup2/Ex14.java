package warmup2;

public class Ex14 {

    public String stringSplosion(String string) {

        StringBuilder stringBuilder;
        int len = string.length();
        int bufferSize = 1;

        for (int i = 2; i <= len; i++){
            bufferSize *= i;
        }

        stringBuilder = new StringBuilder(bufferSize);

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                stringBuilder.append(string.charAt(j));
            }
        }

        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
