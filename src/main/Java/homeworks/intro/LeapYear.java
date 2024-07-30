package homeworks.intro;

public class LeapYear
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        if (n % 400 == 0)
        {
            System.out.println("February has 29 days");
        } else if ((n % 100 != 0) && (n % 4 == 0))
                     {
                        System.out.println("February has 29 days");
                     }
        else System.out.println ("It is not a leap year.February has 28 days");
    }
}