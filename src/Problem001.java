
public class Problem001 {

    public static void main(String[] args)
    {
        int x =1 , summm = 0;

        while(x<1000)
        {
            if(x % 3 == 0 || x % 5 == 0)
            {
                summm += x;
            }
            x++;
        }
        System.out.println ("The Sum is "+ summm);
    }

}


