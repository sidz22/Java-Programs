// Take a sentance from user and count how many words in it.
// Withot Counting White spaces logic.

import java.io.*;
import java.util.*;

class program303
{
    public static void main(String arg[])
    {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the string : ");
            String str = sobj.nextLine();

            String arr[] = str.split(" ");

            System.out.println("Number of words are : "+arr.length);
     }
}