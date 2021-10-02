/*
 *  UCF COP3330 Fall 2021 Assignment 30 Solutions
 *  Copyright 2021 Garrett Adams
 */

package Exercise30;

public class Solution30 {
    public static void main(String[] args)
    {
        //Declares the variables that we will be using
        int h = 1;
        int w = 1;

        //For loop that runs until h is <= 12, adds 1 to h for each iteration
        for(h=1;h<=12;h++) {
            //For loop that runs until w is <= 12, adds 1 to w for each iteration
            for(w=1;w<=12;w++)
            {
                //Calculates the multiplication and spaces appropriately
                System.out.print((h*w)+"\t");
            }
            //Adds line breaks
            System.out.println();
        }
    }
}

