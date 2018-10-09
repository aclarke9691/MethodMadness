public class TestFile {
    public static void main (String[] args)
    {
        System.out.println("Hello Method Madness");

        System.out.println(AClarkeLIB.isPalindrome("patty")); //Is not a palindrome.
        System.out.println(AClarkeLIB.isPalindrome("i like ekil i")); //Is a palindrome.
        System.out.println(AClarkeLIB.isPalindrome("543345")); //Is a numeric palindrome.

        System.out.println(AClarkeLIB.cutOut("hospital", "spit")); //Takes spit out of hospital
        System.out.println(AClarkeLIB.cutOut("valid", "valid")); //Takes valid out of valid, leaving an empty mainStr.
        System.out.println(AClarkeLIB.cutOut("ok","boy")); //Boy is not present in ok, so ok is left unchanged.

        System.out.println(AClarkeLIB.sumUpTo(4)); //Adds up all the numbers from 0 to 4.
        System.out.println(AClarkeLIB.sumUpTo(2378)); //Adds up all the numbers from 0 to 2378.
        System.out.println(AClarkeLIB.sumUpTo(-4)); //Since n is negative and less than 0, the method just returns 0.

        AClarkeLIB.multiplicationTable(7, 3); //Multiplies 7 by every number from 0 to 3.
        AClarkeLIB.multiplicationTable(-5,9); //Multiplies -5 by every number from 0 to 9.
        AClarkeLIB.multiplicationTable(8,0); //Since there is no range, 8 is just multiplied by 0 once.

        System.out.println(AClarkeLIB.dateStr("05/07/2002")); //Converts 05/07/2002 to 07-05-2002.
        System.out.println(AClarkeLIB.dateStr("12/31/1990")); //Converts 12/31/1990 to 31-12-1990.
        System.out.println(AClarkeLIB.dateStr("10/08/2018")); //Converts 10/08/2018 to 08-10-2018.
    }
}
