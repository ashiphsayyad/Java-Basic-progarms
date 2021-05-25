
// program to find factorial of a given no
public class Factorial {
    public static void main(String[] args) {
        int fact=1,num= 9;  // find factorial upto 5

        for (int i=1;i<=num;i++)
        {
            fact= fact * i;
        }
        System.out.println("The factorial of " +num + " is " + fact);


    }
}
