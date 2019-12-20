package warmup2;

public class Ex21 {

//  Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
//  so "kittens" yields "kien".

    public String altPairs(String string){

        int length = string.length();

        if (length >= 3){

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < length; i += 4){
                stringBuilder.append(string.charAt(i));

                if (i+1 < length){
                    stringBuilder.append(string.charAt(i+1));
                }
            }

            System.out.println(stringBuilder.toString());
            return stringBuilder.toString();
        }
        else {
            return string;
        }
    }
}
