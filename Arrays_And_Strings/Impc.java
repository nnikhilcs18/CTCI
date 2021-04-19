package Arrays_And_Strings;

import java.util.*;
import java.lang.*;
import java.io.*;



class Impc 
{
    public static void main(String args[])
    {
        boolean b1,b2,b3;
        b1=true;
        b2=false;
        b3=true;
        if(b1&b2 | b2&b3 |b2)
            System.out.println("ok");

            if(b1&b2 | b2&b3 |b2|b1)
            System.out.println("dokey");    
    }
}