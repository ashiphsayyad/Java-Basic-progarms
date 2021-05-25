import java.util.Scanner;

public class ConvertKMToMiles {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter KM to convert into Miles :");
        float km = inp.nextFloat();
        double miles = km * 0.621371;
        System.out.println("Km into Mile is :"+ miles);
    }
}
