package questions50;

public class ChkifListContainsOnlyOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,3,6,7,9};
		
		boolean flag = false;
		
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] % 2 == 0)
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
			System.out.println("Even Found");
		else
			System.out.println("All are odd");

	}

}
