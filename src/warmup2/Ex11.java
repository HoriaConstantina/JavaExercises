package warmup2;

public class Ex11 {

    public String stringTimes(String str, int n){

        StringBuilder stringBuilder = new StringBuilder(str.length()*n);

        if (str != null) {


            for (int i = 1; i <= n; i++) {
                stringBuilder.append(str);
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
