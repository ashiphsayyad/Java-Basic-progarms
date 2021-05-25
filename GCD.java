
//program to calculate GCD or HCM of two number
public class GCD {
    public static void main(String[] args) {
        int num1=3,num2=5;
        int gcd=1;

        for(int i=1;i<= num1 && i<=num2;i++)   //here in condition we r checking i must be small/equal to smallest
                                               // user inputted number
        {
            if(num1%i ==0 && num2%i==0)        //for gcd i must divide both numbers completely and common in both
            {
                gcd = i;
            }
        }
        System.out.printf("Gcd of %d and %d is %d",num1,num2,gcd);

    }
}
