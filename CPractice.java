import java.util.Scanner;

public class CPractice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter array Length ");
        int size= inp.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size + " Elements");

        for(int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }
        int min = arr[0];
        for(int j=1;j<size;j++){
            if(arr[j]< min){
            min = arr[j];
            }
        }
        System.out.println(min);


    }
}
