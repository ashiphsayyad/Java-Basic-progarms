//program to reverse a given number
public class ReverseANumber {
    public static void main(String[] args) {
        int number = 1234,rem,sum;
        while(number !=0)
        {
            rem = number%10;
            number = number/10;
            System.out.print(rem);
        }
    }
}
