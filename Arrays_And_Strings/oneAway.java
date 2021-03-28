//incomplete
package Arrays_And_Strings;

public class oneAway {
    public static void main(String args[])
    {
        String str1="peles";
        String str2="pale";
        if(str1.length()==str2.length())
            oneEditReplace(str1,str2);
        else if(str1.length()-str2.length()==-1)
            oneEditInsertDelete(str1,str2);
        else if(str1.length()-str2.length()==1)
             oneEditInsertDelete(str2, str1);
    }
    static void oneEditReplace(String str1,String str2)
    {
        int countDifference=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                countDifference++;
            }
        }
        System.out.println((countDifference==1)?"One Edit Away":"no");
    }
    static void oneEditInsertDelete(String str1,String str2)
    {
        int countDifference=0;
        int index1=0;
        int index2=0;
        while(index2<str2.length() && index1<str1.length())
        {
            if(str1.charAt(index1)!=str2.charAt(index2))
            {
                index2++;
                countDifference++;
            }
            if(str1.charAt(index1)==str2.charAt(index2))
            {
                index1++;
                index2++;
            }
        }
        System.out.println((countDifference<2)?"One Edit Away":"No");
    }
}
