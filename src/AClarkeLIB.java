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

    public static String cutOut(String mainStr, String subStr)
    {
        String result = "";
        if (mainStr.indexOf(subStr) == -1)
        {
            result = mainStr;
            return result;
        }
        else
        {
            int i= mainStr.indexOf(subStr);
            result = mainStr.substring(0,i );
            result= result + mainStr.substring(i+subStr.length(), mainStr.length());
            return result;
        }
    }

    public static int sumUpTo(int n)
    {
        int i = 0;
        int sum= 0;
        while (i<= n)
        {
            sum= sum+i;
            i= i+1;
        }
        return sum;
    }

    public static String primePrinter(int n)
    {
        int i=1;
        String numbers= "";
        for (int x=n; x>0; x-- )
        {
            if i



        }
        //}
    }
}
