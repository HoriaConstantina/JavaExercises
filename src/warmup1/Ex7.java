package warmup1;

public class Ex7 {

// Given a string, return a string made of the first 2 chars (if present),
// however include first char only if it is 'o' and include the second only if it is 'z',
// so "ozymandias" yields "oz".

    public String startOz(String str)
    {
        int len = str.length();
        String temp = "";
        if(len >= 1)
        {
            if(str.charAt(0) == 'o')
                temp += str.charAt(0);
            if(len >= 2)
            {
                if(str.charAt(1) == 'z')
                    temp += str.charAt(1);
            }
        }
        return temp;
    }
}
