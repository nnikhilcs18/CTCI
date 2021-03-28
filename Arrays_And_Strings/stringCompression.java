package Arrays_And_Strings;
import java.lang.Object;
import java.lang.Character ;


public class stringCompression {
    public static void main(String args[])
    {
    String str1="abcdefghiiiiijkkkkkkkkkk";
    int pointer=0;
    int count=0;
    String solution="";
    while(pointer<str1.length())
    {
        char start=str1.charAt(pointer);
        while(pointer<str1.length() && str1.charAt(pointer)==start)
        {
            pointer++;
            count++;
        }
        solution+=start+String.valueOf(count);
        count=0;
    }
    System.out.println((str1.length()<solution.length())?str1:solution);
}
}
