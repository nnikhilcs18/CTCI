package Arrays_And_Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class characterFrequency {
    public static void main(String args[])
    {
        String str="this is a sample string";
        countFrequeny(str);
    }
    public static void countFrequeny(String word) {

        char [] characters=word.toCharArray();
        Map<Character,Integer>charMap=new HashMap<Character,Integer>();
        for(Character ch:characters)
        {
            if(charMap.containsKey(ch))
                charMap.put(ch,charMap.get(ch)+1);
            else
                charMap.put(ch,1);
        }
        System.out.println(Arrays.asList(charMap));
    }
    
}
