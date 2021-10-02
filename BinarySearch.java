package questions50;

public class BinarySearch {
	
	public static int BinarySear(int []a,int key)
	{
		int left=0,right=a.length-1;
		int index = -1;
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(a[mid] == key)
			{
				index = mid;
				break;
			}
			else if(a[mid] > key)
			{
				right = mid-1;
			}
			else if(a[mid] < key)
			{
				left = mid + 1;
			}
			
		}
		return index;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {20,23,34,45,48,56,78,99};
		
		int key = 70;
		
		int index =BinarySear(arr,key);
		
		if(index > 0)
			System.out.println("The element is at "+ (index+1) + " Position");
		else
			System.out.println("Element Not found");
		

	}

}
