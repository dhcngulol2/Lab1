package BaiTH;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	public int[] mirror() {
		int[] result = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
			result[array.length * 2 - i - 1] = array[i];
		}

		return result;
	}

	public int[] removeDuplicates() {

		ArrayList<Integer> re = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			if (!re.contains(array[i])) {
				re.add(array[i]);
			}
		}
		int[] result = new int[re.size()];
		for (int i = 0; i < re.size(); i++) {
			result[i] = re.get(i);
		}

		return result;
	}

	public int[] getMissingValues() {
		ArrayList<Integer> list= new ArrayList<>();
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] < array[i + 1] - 1) {
				int nu = array[i+1]-array[i]-1;
				for (int j = 1 ; j <= nu ; j++) {
					 list.add(array[i]+j);
				}

			}
		}
		int [] result = new int [list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		return result;
	}
	public int[] fillMissingValues(int k) {
		

	    return null;
	}


	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3};
		MyArray myArray = new MyArray(array1);
		int[] re = myArray.mirror();
		System.out.println("mirro : "+Arrays.toString(re));
		
		int[] array2 = { 1, 2, 3, 5, 5, 7, 9};
		MyArray myArray2 = new MyArray(array2);
		int[] re2 = myArray2.removeDuplicates();
		System.out.println("remove Duplicates : "+Arrays.toString(re2));
		
		int[] array3 = { 1, 2, 3, 5, 6, 7, 9};
		MyArray myArray3 = new MyArray(array3);
		int[] re3 = myArray3.getMissingValues();
		System.out.println("get MIssing Values :"+Arrays.toString(re3));
		
		int[] array4 = { 1, 2, 3,-1, 5, 6, 7, 9};
		MyArray myArray4 = new MyArray(array4);
		int[] re4 = myArray4.getMissingValues();
		System.out.println(Arrays.toString(re4));
	}

}
