import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int range = inp.nextInt();
        int num1=0,num2=1,sum;
        System.out.printf("%d,%d ",num1,num2);

        for(int i=2;i<range;i++)
        {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
        }


    }
}
