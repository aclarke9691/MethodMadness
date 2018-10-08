public class TestFile {
    public static void main (String[] args)
    {
        System.out.println("Hello Method Madness");

        System.out.println(AClarkeLIB.isPalindrome("patty"));
        System.out.println(AClarkeLIB.isPalindrome("step on no pets"));
        System.out.println(AClarkeLIB.isPalindrome("543345"));

        System.out.println(AClarkeLIB.cutOut("hospital", "spit"));
        System.out.println(AClarkeLIB.cutOut("valid", "l"));
        System.out.println(AClarkeLIB.cutOut("ok","boy"));

        System.out.println(AClarkeLIB.sumUpTo(4));
        System.out.println(AClarkeLIB.sumUpTo(2378));
        System.out.println(AClarkeLIB.sumUpTo(-4));

        AClarkeLIB.multiplicationTable(7, 3);
        AClarkeLIB.multiplicationTable(-5,9);
        AClarkeLIB.multiplicationTable(8,5);

        System.out.println(AClarkeLIB.dateStr("05/07/2002"));
        System.out.println(AClarkeLIB.dateStr("12/31/1990"));
        System.out.println(AClarkeLIB.dateStr("10/08/2018"));
    }
}
