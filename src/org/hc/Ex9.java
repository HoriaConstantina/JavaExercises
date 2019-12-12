package org.hc;

public class Ex9 {

// Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
// so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

    public String front22(String str)
    {
        String temp;
        int len = str.length();
        if(len > 2)
            len = 2;
        temp = str.substring(0, len);
        return (temp + str + temp);
    }
}
