
//program to find prime number
public class PrimeNumber {
    public static void main(String[] args) {
        int number=10,count=0;
        for(int i=1;i<=number;i++)
        {
            if(number%i ==0)
            {
                count++;
            }
        }
        if (count == 2)
            System.out.printf("%d is Prime No.",number);
        else
            System.out.printf("%d is Not Prime No.",number);

    }
}
