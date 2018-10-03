public class AClarkeLIB {
    public static boolean isPalindrome(String word)
    {
       String backwards =  "";
       for (int i= word.length()-1; i>=0; i--)
       {
           String a = word.substring(i, i+1);
           backwards= backwards+a;
       }
       if (word.equals(backwards) == true)
       {
           return true;
       }
       else
       {
           return false;
       }

    }

    public static boolean
}
