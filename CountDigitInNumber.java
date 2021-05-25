import java.util.Scanner;

// program to count digits in integer
public class CountDigitInNumber {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Enter any Integer : ");
        int number = inp.nextInt();

        int count=0;
        while(number !=0)        //looping until quotient > 0
        {
            number = number/10;    // dividing a unknown number by 10 saving it to number again
            count++;               // after every time it increse by 1
        }
        System.out.println("There are "+count + " Digit in a given Number.");

    }
}
