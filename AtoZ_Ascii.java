
// program to print ASCII values from A to Z
public class AtoZ_Ascii {
    public static void main(String[] args) {

        int j=0;                      //declaring extra variable j which start from 0
        char A,Z;
        for (int i='A';i<='Z';i++)    //loop start from A's Ascii value to Z's Ascii value
        {
            System.out.printf("%c =  %d\n",('A'+j),('A'+j));
            j++;                       // incremainting j in every loop by 1 to print Char and Ascii value
        }
    }
}
