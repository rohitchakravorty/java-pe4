package com.stackroute.pe4;

import javax.print.DocFlavor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*to find the presence of the name Harry in a string.*/

public class SearchRegularExpression {
    public boolean regularExpressionSearcher(String inputString)
    {
        Pattern pa=Pattern.compile("Harry?");
        Matcher ma=pa.matcher(inputString);
        if(ma.find())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
