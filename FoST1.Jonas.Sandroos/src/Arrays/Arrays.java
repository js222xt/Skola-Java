package Arrays;


public class Arrays {
	
	public static int sum(int[] arr){
		int sum = 0;
		for(int num : arr){
			sum += num;
		}
		
		return sum;
	}
	
	public static String toString(int[] arr){
		String ret = "";

		for(int i = 0; i < arr.length; i++){
			ret += "[" + i + "] = " + arr[i] + "\n";
		}
		
		return ret;
	}
	
	public static int[] addN(int[] arr, int n){
		for(int i = 0; i < arr.length; i++){
			arr[i] += n;
		}
		
		return arr;
	}
	
	public static int[] reverse(int[] arr){
		int[] reversed = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			reversed[reversed.length -1 -i] = arr[i];
		}
				
		return reversed;
	}
	
	public static void replaceAll(int[] arr, int old, int nw) {
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == old){
				arr[i] = nw;
				System.out.println(old + " has been changed to " + nw);
			}
			else{
				System.out.println(arr[i] + " stays the same");
			}
		}
	}
	
	public static int[] sort(int[] arr){
		int[] sorted = arr.clone();
		int changed = -1;
		
		while(changed != 0){
			changed = 0;
			for(int i = 0; i < sorted.length; i++){
				
				if(i + 1 != sorted.length){
					if(sorted[i] > sorted[i + 1]){
						int tmp = sorted[i];
						sorted[i] = sorted[i + 1];
						sorted[i + 1] = tmp;
						changed++;
					}
				}				
			}
		}
		
		
		return sorted;
	}
	
	public static boolean hasSubsequence(int[] arr, int[] sub){
		boolean isSub = true;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == sub[0]){
				if(i + sub.length < arr.length){
					for(int j = 0; j < sub.length; j++){
						if(arr[i + j] != sub[j]){
							isSub = false;
						}
					}
				}
				else{
					return false;
				}
			}
		}
		
		return isSub;
	}
	
	public static int[] absDif(int[] arr1, int[] arr2){
		try{
			if(arr1.length != arr2.length){
				throw new Exception("First array has a different size then the second array! They must be the same!");
			}
			
			int[] dif = new int[arr1.length];
			
			for(int i = 0; i < arr1.length; i++){
				dif[i] = arr1[i] - arr2[i]; 
			}
			
			return dif;
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
		return new int[0];
		
	}

}