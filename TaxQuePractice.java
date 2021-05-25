import java.util.Scanner;

public class TaxQuePractice {
    public static void main(String[] args) {
        Scanner inp_income = new Scanner(System.in);
        System.out.print("Enter Your Income in Lank per annum : ");
        float income = inp_income.nextFloat();

        float tax = 0;

        if (income<=2.5f){
            tax = tax + 0;
            System.out.println(tax);
            }

        else if (income>2.5f && income<= 5.5f){
            tax = 0.05f * (income-2.5f);
            System.out.println("You have to pay tax : "+tax);
            }

        else if (income>5.5f && income>=10.0f){
            tax = 0.05f * (5.5f-2.5f);
            tax = tax + 0.2f* (income-5.5f);
            System.out.println("You have to pay tax : "+tax);
        }

        else if (income>10.0f){
            tax = 0.05f * (5.5f-2.5f);
            tax = tax + 0.2f * (10.0f-5.5f);
            tax = tax + 0.3f * (income-10.0f);
            System.out.println("You have to pay tax : "+tax);
        }


    }
}
