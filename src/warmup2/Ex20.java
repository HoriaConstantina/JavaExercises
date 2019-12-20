package warmup2;

public class Ex20 {

    public String stringX(String string){

        int len = string.length();

        if (len >= 2){
            len--;
            StringBuilder stringBuilder = new StringBuilder(len-1);
            stringBuilder.append(string.charAt(0));

            for (int i = 1; i < len; i++){
                if (string.charAt(i) != 'x'){
                    stringBuilder.append(string.charAt(i));
                }
            }
            stringBuilder.append(string.charAt(len));
            System.out.println(stringBuilder.toString());
            return stringBuilder.toString();
        }
        else {
            return string;
        }
    }
}
