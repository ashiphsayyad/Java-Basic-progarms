import java.lang.Math;
//Program to find a No, is Amstrong or Not e.g 153 = 1^3 + 5^3 + 3^3

public class AmstrongNo {
    public static void main(String[] args) {
        int num=153;                    //program is run succesfully upto 3 digit number
        int originalNo = num;
        int rem;
        double total=0;

        while (num!=0)
        {
         rem= num%10;
         total = Math.pow(rem,3) + total;           //using Math.pow function to get the power
         num = num/10;
        }
        if(originalNo==total)
            System.out.printf("The %d is a Amstrong No.",originalNo);
        else
            System.out.printf("The %d is Not a Amstrong No.",originalNo);

    }
}
