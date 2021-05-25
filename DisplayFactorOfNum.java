
//program to display factors of a number
public class DisplayFactorOfNum {
    public static void main(String[] args) {
        int num = 24;
        System.out.printf("The factors of %d is : ",num);
        for (int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i + " ");
            }
        }

    }
}
