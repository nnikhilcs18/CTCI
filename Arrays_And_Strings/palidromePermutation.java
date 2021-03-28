//incomplete
package Arrays_And_Strings;

class palidromePermuation{
public static void main(String args[])
{
    String str1="tacocat";
    System.out.println(isPermutationOfPalidrome(str1));
}
static boolean isPermutationOfPalidrome(String str)
{
    int []table=buildCharFrequencyTable(str);
    return checkMaxOneOdd(table);
}
static boolean checkMaxOneOdd(int[] table)
{

}
static int[] buildCharFrequencyTable(String str)
{
    int[] table=new int[256];
    for(char c: str.toCharArray())
    {
        int x=getCharNumber(c);

    }


}

}