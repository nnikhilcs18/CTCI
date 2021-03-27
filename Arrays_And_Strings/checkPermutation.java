package Arrays_And_Strings;

import java.util.Arrays;

public class checkPermutation {
    public static void main(String args[])
    {
        String s1="apple";
        String s2="elpqa";

        char []ch1=s1.toCharArray();
        char []ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int flag=0;
        for(int i=0;i<s1.length();i++)
        {
            if(ch1[i]!=ch2[i])
            flag=1;
        }
        System.out.println((flag==1)?"no" : "yes");


    }
    
}
