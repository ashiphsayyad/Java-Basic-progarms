import java.util.Scanner;


//Menu driven program which has following options
// 1.Factorial of Number  2.Prime or not   3.Odd or even   4.Exit
public class MenuDriveSwitchCase {
    public static void main(String[] args) {
        int num = 10;

     //Taking input from user for performing switch case statements below
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter any choice from 1 to 4 to perform action : ");
        byte value = inp.nextByte();

            switch (value)
            {
                case 1 : //Calculating Factorial of Number
                    int fact = 1;
                    for(int i=1;i<=num;i++)
                    {
                        fact = fact * i;
                    }
                    System.out.printf("The factorial of %d is %d\n",num,fact);
                    break;


                case 2 : //Check whether a number is Prime or Not
                    int count=0;

                    for (int i =2;i<=num;i++)
                    {
                        if(num%i==0)
                            count++;
                    }

                    if (count==1)
                        System.out.printf("The %d is Prime Number.\n",num);
                    else
                        System.out.printf("The %d is Not a Prime Number.\n",num);
                    break;


                case 3 : //Check whether a Number is Even or Odd
                    if (num%2==0)
                        System.out.printf("The %d is Even Number.\n",num);
                    else
                        System.out.printf("The %d is Odd Number.\n",num);
                    break;


                default://Exit
                    System.out.println("Exit");
            }

    }
}
