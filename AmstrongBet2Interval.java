
// program to find Amstrong number between two interval
public class AmstrongBet2Interval {
    public static void main(String[] args) {

        int rem;
        int start_no=1,end_no=1000;    //Printing Amstrong no. between 1 to 1000
         int reverse=0;                //initializing reverse=0 global

        for (int i=start_no;i<=end_no;i++)      //looping from start to end
        {
            int num = i;   //we have to compare our i with inner loop value after it fails therefore putting i to new

            while (num != 0) {
                rem = num % 10;
                reverse = (rem*rem*rem)+ reverse;  //cubing and storing to reverse
                num = num / 10;

            }
            if (i == reverse)
                System.out.println(i);
            reverse =0;
        }

    }
}
