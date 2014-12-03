package test1;

public class ArrayOperations {
	
	public static int[] reverseArray(int[] array){
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++){
			newArray[i] = array[(array.length - i) - 1]; //Subtracted 1 to keep in array boundaries
		}
		return newArray;
	}
	
	public static int arraySum(int[][] array) {
		int total = 0;
		
		
		for (int i = 0; i < array.length; i++){ 
			for (int col = 0; col < array[i].length; col++) { //Didn't need to subtract 1 from length
				total += array[i][col];
			}
		}
		return total;
	}
}
