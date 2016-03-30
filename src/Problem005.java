/**
 * Created by User on 3/30/2016.
 */
public class Problem005
{
    public static void main (String[]args)
    {
        boolean GotAnswer = false;
        boolean flag = true;

        int x =0;

        while(!GotAnswer)
        {
            x++;

            flag = true;

            for(int y = 1; y < 20; y++)
            {
                if(x % y !=0)
                {
                    flag = false;
                }
            }
            if(flag)GotAnswer = true;
        }
        System.out.println(x);
    }

}
