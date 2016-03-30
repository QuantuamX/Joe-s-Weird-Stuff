/**
 * Created by User on 3/29/2016.
 */

public class Problem004
{
    public static void main(String[]args)
    {
        int product = 1;

        int current;
        int BiggerNo = 0;

        for( int x= 100; x < 1000; x++)
        {
            for( int y= 100; y < 1000; y++)
            {
                product = x * y;
                if ( Palindrome(Integer.toString(product)))
                {
                    System.out.println("The Product of the 2 Numbers"+ product);

                    current = product;
                    if( current > BiggerNo)
                    {
                        BiggerNo = current;
                    }
                }
            }
        }
        System.out.println("The Biggest Palindrome" + BiggerNo);
    }
    public static  boolean Palindrome( String s)
    {
        String RevPali = "";
        for (int i = s.length(); i > 0; i--)
        {
            RevPali += s.charAt(i-1);
        }
        if(s.equals(RevPali))
        {
            return true;
        }

        return false;
    }
}

