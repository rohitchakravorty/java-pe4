package com.stackroute.pe4;
/*count the total number of occurrences of a given character in a string*/
public class CharacterOccurence
{
    public int charOccurenceChecker(String str,String key)
    {
        return str.length()-str.replace(key,"").length(); //Difference of original length and length of string after removing the character.
    }
}
