package com.stackroute.pe4;

import java.util.Arrays;
/*Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.*/
public class AlphabetStringSort
{
    public String wordAlphabetSorter(String inputString)
    {
       String[] sortedString=inputString.split(" ");
       Arrays.sort(sortedString);
       return Arrays.toString(sortedString);

    }

}
