import java.util.Arrays;
import java.util.List;


public class Array {
	public static void main(String args[]){
	    int array[] = new int[]{10, 23, 54, 4, 12, 100};
	 
	    // Calling getMax() for max value
	    int max = getMax(array);
	    System.out.println("Maximum Value is: "+max);
	 
	    // Calling getMin() for min value
	    int min = getMin(array);
	    System.out.println("Minimum Value is: "+min);
	  }
	 
	  // Method for getting the maximum value
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  // Method for getting the minimum value
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
	
	  
	  
	  //Sum Using a For Loop
	public static int findingsumusingarray(int[] array) {
			int sum = 0;
			for (int value : array) {
					sum += value;
			}
			return sum;
	}
	//Searching for a value
	public static boolean searchingforvalue(Integer[] arr, Integer item) {
		List<Integer> list = Arrays.asList(arr);
		return list.contains(item);
	}
	public static void list(String[] args) {
		Integer[] myArray = { 4, 7, 18, 13, 12, 26, 17, 3, 9, 21 };
		System.out.println(contains(myArray, 13));
		System.out.println(contains(myArray, 25));
	}

	private static char[] contains(Integer[] myArray, int i) {
		return null;
	}
	
	
}

