public class AClarkeLIB {
    public static boolean isPalindrome(String word) //This method evaluates whether a given word is a palindrome or not, meaning that it is spelled the same way backwards and forwards.
    {
       String backwards =  "";
       for (int i= word.length()-1; i>=0; i--) //This loop spells out the given word backwards.
       {
           String a = word.substring(i, i+1);
           backwards= backwards+a;
       }
       if (word.equals(backwards) == true) //Is the spelling of the word backwards the same as the spelling of the word forwards?
       {
           return true; //The word spelled backwards is the same as the word spelled forwards, thus it is a palindrome.
       }
       else
       {
           return false; //The word spelled backwards is not the same word as the word spelled forwards, thus it is not a palindrome.
       }

    }

    public static String cutOut(String mainStr, String subStr) //This method takes out a given word/letter subStr from a given word mainStr.
    {
        String result = "";
        if (mainStr.indexOf(subStr) == -1) //If the word subStr is not present within the word mainStr, just return mainStr.
        {
            result = mainStr;
            return result;
        }
        else
        {
            int i= mainStr.indexOf(subStr);
            result = mainStr.substring(0,i );
            result= result + mainStr.substring(i+subStr.length(), mainStr.length()); //The result consists of everything before subStr appears in mainStr, and everything after subStr appears in mainStr all put together.
            return result;
        }
    }

    public static int sumUpTo(int n) //This method takes a number n and adds up all the numbers in between 0 and n.
    {
        int i = 0;
        int sum= 0;
        while (i<= n) //i starts at 0, is added to the sum and inccreases by one each time until it reaches n.
        {
            sum= sum+i;
            i= i+1;
        }
        return sum;
    }

    public static void multiplicationTable(int base, int range) //This method takes a number base and multiplies it by every number starting from zero up until number range.
    {
        int x=0;
        while (x<=range) //The base is multiplied by numbers from 0-range one by one.
        {
            System.out.println(base + "* " + x + "= " + base * x);
            x = x + 1;
        }
    }

    public static String dateStr(String datee) //This method converts a given date datee from mm/dd/yyyy form to dd-mm-yyyy form.
    {
        String mm = datee.substring(0,2); //Establishes the first two numbers of datee as the month.
        String dd = datee.substring(3,5); //Establishes the third and fourth numbers of datee as the day.
        String yy = datee.substring(6,10); //Establishes the last four numbers of datee as the year.
        String newdate=  dd + "-" + mm + "-" + yy; //Rearranges the date.
        return newdate;
    }
}
