
//program to find
public class PrimeBet2Interval {
    public static void main(String[] args) {

        int start= 2,end=10;

        for(int i=start;i<=end;i++)        //looping from start to end in range
        {
            int count=0;                        //after every inner loop false count must be empty
            for (int j=2;j<=i-1;j++)       // dividing a number upto number-1
            {
                if(i%j==0)                  //checking if remainder=0
                {
                    count++;
                }
            }
            if (count==0)               //if count=1 means it has more than 1 factor
                System.out.print(i+"  ");
        }

    }
}
