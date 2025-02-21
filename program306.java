// Take a sentance from user and Display all words in that sentance.
// trimming white spaces.

import java.io.*;
import java.util.*;

class program306
{
    public static void main(String arg[])
    {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the string : ");
            String str = sobj.nextLine();

            String newstr = str.replaceAll("\\s+"," ");
            String newstr2 = newstr.trim();

            String arr[] = newstr2.split(" ");

            for(int i =0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
     }
}