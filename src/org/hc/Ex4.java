package org.hc;

public class Ex4 {

// Given 2 int values, return true if one is negative and one is positive.
// Unless the parameter "negative" is true, then they both must be negative.

    public boolean posNeg(int a, int b, boolean negative)
    {
        if(negative)
            return (a < 0 && b < 0);
        return (a < 0 && b > 0 || a > 0 && b < 0);
    }
}
