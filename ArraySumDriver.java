/*
 * Nabil El-Hage
 * CSMS 204
 * Lab 4: Recursion
 */
public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 3;
		myArray[index++] = 5;
		myArray[index++] = 2;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		System.out.println(fibonacci(5));
	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static int sumOfArray(Integer[] arr, int num) {
		if(num <= 0){
			return 0;
		}else{
			return (arr[num] + sumOfArray(arr, num - 1));
	}
	}
	
	public static int fibonacci(int num){
	         if(num <= 1){
	        	 return num;
	         }else{
	        	 return fibonacci(num - 1) + fibonacci(num - 2);
	        	 }
	}
}