package com.stackroute.pe4;
/*transpose the given string*/
public class TransposeString
{
    public String stringTranspose(String inputString)
    {
        String result="";
        String[] transposedString=inputString.split(" ");
        for(String arr:transposedString)
        {
            StringBuffer sb=new StringBuffer(arr);
            sb=sb.reverse();
            result=result.concat(sb.toString()).concat(" ");
        }
        return result;
    }
}
