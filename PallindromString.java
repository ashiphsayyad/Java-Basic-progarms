//Check whether String is pallindrome or not

import java.util.Scanner;

public class PallindromString {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter Any string : ");
		String s = inp.next();
		
		 int f=0;
		
		for(int i=0,j=s.length()-1;i<=j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				f=1;
		}
		if(f==0)
			System.out.println(s + " is Pallindrom!!!");
		else
			System.out.println(s + " is Not Pallindrom!!!");
	}

}
