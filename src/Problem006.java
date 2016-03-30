import static java.lang.System.out;

/**
 * Created by User on 3/30/2016.
 */
public class Problem006
{
    public static void main(String[]args)
    {
        int sumSquare = 0, ans1=0, sum= 0, square = 0, diff;

       for(int num =0; num <= 100; num++)
       {
           sumSquare = num * num;
           ans1 += sumSquare;
       }
        for(int digi =0; digi <= 100; digi++)
        {
            sum += digi;
            square = sum * sum;
        }
        diff = square - ans1 ;
        System.out.println(diff);
    }
}
