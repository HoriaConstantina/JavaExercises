package warmup2;

public class Ex12 {

    public String frontTimes(String str, int n) {

        StringBuilder stringBuilder = new StringBuilder(str.length()*n);
        String front = str.substring(0, 3);

        for (int i = 0; i < n; i++) {
            stringBuilder.append(front);
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
