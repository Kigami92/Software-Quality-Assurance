package test1;

import junit.framework.TestCase;

public class TestArrayOperations extends TestCase {
	
	
	public void testReverseArray() {
		int[] array = new int[5];
		for(int i = 0; i < 5; i++){
			array[i] = i + 1;
		}
		
		assertEquals(5, ArrayOperations.reverseArray(array)[0]);
		assertEquals(4, ArrayOperations.reverseArray(array)[1]);
		assertEquals(3, ArrayOperations.reverseArray(array)[2]);
		assertEquals(2, ArrayOperations.reverseArray(array)[3]);
		assertEquals(1, ArrayOperations.reverseArray(array)[4]);
	}

	public void testArraySum() {
		int num = 0;
		int[][] array = new int[3][2];
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 2; j++){
				array[i][j] = num;
				num++;
			}
		}
		assertEquals((0 + 1 + 2 + 3 + 4 + 5), ArrayOperations.arraySum(array));
	}

}
