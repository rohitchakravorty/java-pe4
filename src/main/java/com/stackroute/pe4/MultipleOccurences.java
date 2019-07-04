package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*to find out the multiple occurrences of the given word in a string using Matcher methods.*/
public class MultipleOccurences
{
    public String findMultipleOccurences(String str,String pattern)
    {
        String result="";
        Pattern pa=Pattern.compile(pattern);
        Matcher ma=pa.matcher(str);
        boolean found=false;
        while(ma.find())
        {
            result=result+"Found at "+ma.start()+"-"+ma.end()+" ";
            found=true;
        }
        if (!found)
        {
            return "No match found";
        }

        return result;



    }
}
