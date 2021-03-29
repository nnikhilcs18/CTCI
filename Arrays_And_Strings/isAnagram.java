package Arrays_And_Strings;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {
    public static void main(String args[])
    {
        String str1="apple";
        String str2="papel";
        checkAnagram(str1,str2);
    }
    static void checkAnagram(String str1,String str2)
    {
        //if(str1.length()!=str2.length())
        Map<Character,Integer>charMap=new HashMap<>();
        Map<Character,Integer>charMap2=new HashMap<>();
        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();
        for(Character ch:char1)
        {
            if(charMap.containsKey(ch))
                charMap.put(ch,charMap.get(ch)+1);
            else
                charMap.put(ch,1);
        }
        for(Character ch2:char2)
        {
            if(charMap2.containsKey(ch2))
                charMap2.put(ch2,charMap2.get(ch2)+1);
            else
                charMap2.put(ch2,1);
        }
        System.out.println(charMap.equals(charMap2));
    }
    
}
