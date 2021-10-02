package questions50;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr = {2,5,3,8,12,6};
		
		List<Integer> arrlis = Arrays.asList(arr);
		
		Collections.shuffle(arrlis);
		
		arrlis.toArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
