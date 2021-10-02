package questions50;

import java.util.Arrays;


public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {12,43,84,67,84,33};
		
		Arrays.sort(arr);
		
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i] != arr[arr.length-1])
			{
				System.out.println("Second Largest Ele is "+ arr[i]);
				break;
			}
			else
				System.out.println("No second largest ele");
			
		}
		
		
		//System.out.println(arr[arr.length-2]);

	}

}
