import java.util.Locale;
import java.util.Scanner;

public class QuestionPractice {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        System.out.print("Enter Subject 1 Marks :");
        float subject1 = mark.nextFloat();
        System.out.print("Enter Subject 2 Marks :");
        float subject2 = mark.nextFloat();
        System.out.print("Enter Subject 3 Marks :");
        float subject3 = mark.nextFloat();

        float avg= (subject1+subject2+subject3)/3.0f;

         if (avg >=40 && subject1>=33 && subject2>=33 && subject3>=33){
             System.out.println("You are passed the examination!");
         }
         else {
             System.out.println("You failed in examination");
         }




    }
}
