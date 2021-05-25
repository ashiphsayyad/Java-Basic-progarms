
//program to find Lcm of 2 numbers
public class LCM {
    public static void main(String[] args) {

 /*       int num1 = 6, num2 = 8;
           int gcd=1;

        for (int i = 1; i <= num1 && i <= num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                gcd = i;
            }

        }
        int lcm = (num1*num2) / gcd;
        System.out.printf("Lcm of %d and %d is %d",num1,num2,lcm);
*/

        // using for loop
        int num1 = 6, num2 = 8;
        int lcm;
        lcm = (num1>num2)?num1:num2;
        while(true)
        {
            if (lcm%num1==0 && lcm%num2==0)
            {
                System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
                break;
            }
            lcm++;
        }



    }
}
