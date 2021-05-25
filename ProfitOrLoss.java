import java.util.Scanner;

//input sp and cp from user and calculate profit or loss
public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the cost price : ");
        float cost_price = inp.nextFloat();  //taking Cost price from user

        System.out.print("Enter the cost price : ");
        float selling_price = inp.nextFloat();  //taking Selling price from user

        if(selling_price>cost_price)   // formula for profit is profit= sp - cp
            System.out.println("You gain profit of Rs. "+ (selling_price-cost_price) );
        else                           // formula for profit is profit= sp - cp
            System.out.println("You occured Loss of Rs. "+ (selling_price-cost_price) );
    }
}
