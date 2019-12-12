package org.hc;

public class Ex5 {

    // Given a string, return a new string where the first and last chars have been exchanged

    public String frontBack(String str)
    {
        int len = str.length();
        if(len >= 2)
        {
            len--;
            return (str.charAt(len) + str.substring(1, len) + str.charAt(0));
        }
        else
            return str;
    }
}
