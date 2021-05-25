import java.util.Scanner;

//Printing Multiplication table
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Multiplicatin table of : ");
        int num = inp.nextInt();                   //Taking number as input from user

        for (int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }

    }
}
