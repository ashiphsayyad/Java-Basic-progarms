import java.util.Scanner;

public class SwitchCasePractice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter any number between 1 tp 7 :");
        byte day = inp.nextByte();


        switch (day) {
            case 1 -> System.out.println("Today is Monday!");
            case 2 -> System.out.println("Today is Tuesday!");
            default -> System.out.println("Enjoy your day");
        }
    }
}
