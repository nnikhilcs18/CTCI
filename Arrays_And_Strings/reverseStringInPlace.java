package Arrays_And_Strings;

public class reverseStringInPlace {
    public static void main(String args[])
    {
        String str1="ORANGEZ";
        int start=0;
        int end=str1.length()-1;
        char [] str=str1.toCharArray();
        while(start<end)
        {
            char temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
        System.out.println(str);
    }
}
