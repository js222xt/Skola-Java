package Arrays;

public class ArraysMain {

	public static void main(String[] args ){
		// arr
		int[] arr = {3,4,3,6,1};
		
		// Sum
		System.out.println("Sum of \n" + Arrays.toString(arr) + Arrays.sum(arr));
		
		// toString
	    String str = Arrays.toString(arr);
	    System.out.println("n = \n" + str);
	    
	    // add n 
	    int n = 2;
	    System.out.println("AddN: \nBefore adding " + n +": \n" + Arrays.toString(arr) + "\nAfter:\n" + Arrays.toString(Arrays.addN(arr, n)));
	    
	    // Reverse
	    System.out.println("Reverse the array: \n" + Arrays.toString(arr) + "\nAfter: \n" + Arrays.toString(Arrays.reverse(arr)));
	    
	    // Replace
	    Arrays.replaceAll(arr, 5, 10);
	    
	    // Sort
	    int[] arr2 = {1,2,3,4,5};
	    int[] arr3 = {5,4,3,2,1};
	    int[] arr4 = {2,5,1,2,3};
	    int[] arr5 = {6,1,3,2,5};
	    System.out.println("Sorted: \n" + Arrays.toString(Arrays.sort(arr)));
	    System.out.println("Sorted: \n" + Arrays.toString(Arrays.sort(arr2)));
	    System.out.println("Sorted: \n" + Arrays.toString(Arrays.sort(arr3)));
	    System.out.println("Sorted: \n" + Arrays.toString(Arrays.sort(arr4)));
	    System.out.println("Sorted: \n" + Arrays.toString(Arrays.sort(arr5)));
	    
	    // hasSubsequence
	    int[] arr6 = {1,2,3,4,5};
	    int[] subtrue = {2,3,4};
	    int[] subfalse = {2,4,5};
	    
	    System.out.println("hasSubsequence: \nTrue:" + Arrays.hasSubsequence(arr6, subtrue));
	    System.out.println("hasSubsequence: \nFalse:" + Arrays.hasSubsequence(arr6, subfalse));
	    
	    // absDif
	    int[] arr7 = {1,2,3,4,5};
	    int[] arr8 = {1,1,1,1,1};
	    System.out.println("\nabsDif: \n" + Arrays.toString(Arrays.absDif(arr7, arr8)));
	}
	
}
