/**
 * Created by User on 3/29/2016.
 */
public class Problem002
{
    public static void main(String[]args)
    {
        long prev =2, cur=3, next=5,ans=2;
            do {
                prev = cur;
                cur = next;
                next= cur+ prev;
                if(cur % 2 ==0)
                {
                    ans += cur;
                }
            }
            while(next< 4000000);
                System.out.println(ans);
    }

}
