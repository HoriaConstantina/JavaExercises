package warmup2;

public class Ex22 {


// Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
// but the "a" can be any char. The "yak" strings will not overlap.

    public String stringYak(String string){

        int length = string.length();
        int i = 0;
        char ch;
        StringBuilder stringBuilder = new StringBuilder(length);

        while (i < length){

            ch = string.charAt(i);

            if (i+2 < length && ch == 'y' && string.charAt(i+2) == 'k'){
                i += 3;
            }
            else {
                stringBuilder.append(ch);
                i++;
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
