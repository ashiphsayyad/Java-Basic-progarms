import java.util.Scanner;

//program to calculate power of a number
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = inp.nextInt();

        System.out.print("Enter power : ");
        int power = inp.nextInt();

        int total=1;
        for (int i=power;i!=0;i--)
        {
            total=total*number;

        }
        System.out.printf("%d to power %d is %d",number,power,total);



    }
}
