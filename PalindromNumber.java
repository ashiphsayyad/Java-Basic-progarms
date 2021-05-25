
//program to fina a number is palindrome or not
public class PalindromNumber {
    public static void main(String[] args) {
        int number = 1234,rem;
        int original_no = number;  // putting number value to original value bcoz number is going to chnge in loop
        int reverse_no = 0;
            //reverse a number program
         while (number!=0)
         {
             rem = number%10;
             reverse_no = reverse_no * 10 + rem;     //here collecting remainder value
             number = number/10;
         }
        System.out.println("Reverse number is : "+reverse_no);
         if (original_no == reverse_no)
             System.out.println("Its a Palindrom number");
         else
             System.out.println("Not a Palindrom number");

    }
}
