import java.util.Scanner;

public class DegreeProb {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your percentage obtained In sub A : ");
        byte subA = inp.nextByte();

        System.out.print("Enter your percentage obtained In sub B : ");
        byte subB = inp.nextByte();

        if ( (subA>=55 && subB>=45) || (subA>=45 && subB>=55) )
        {
            System.out.println("Congratulation for your Graduation!!!");
        }
        else if (subA>=65 && subB<45)
        {
            System.out.println("You are allowed to reappear for Sub B");
        }
        else
            System.out.println("You are Failed");

    }
}
