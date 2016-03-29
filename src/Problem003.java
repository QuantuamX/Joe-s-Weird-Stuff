/**
 * Created by User on 3/29/2016.
 */
import java.util.ArrayList;
import java.util.List;

public class Problem003
{
    static List<Long>factors(long num) {
        ArrayList<Long> factors = new ArrayList<Long>();

        for (long x = 2; x <= num; x++) {
            while (num % x == 0) {
                factors.add(x);
                num /= x;
            }
        }
        return factors;
    }
    public static void main(String[]args)
    {
        for(long facs: factors(600851475143L))
        {
            System.out.println(facs);
        }
    }
}

