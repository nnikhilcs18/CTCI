package Arrays_And_Strings;

class isUnique{
    public static void main(String args[])
    {
        String inputString="abcdefghijklmnopqrstuvwxyz123";
        System.out.println(checkUnique(inputString));
    }
    static boolean checkUniqueNaive(String s)
    {
        if(s.length()==0)
            return false;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    return false;
            }
        }
        return true;
    }
    static boolean checkUnique(String str)
    {
        boolean [] check=new boolean[256];
        for(int i=0;i<str.length();i++)
        {
            int val=str.charAt(i);
            if(check[val])
            {
                return false;
            }
            check[val]=true;
        }
        return true;
    }
}