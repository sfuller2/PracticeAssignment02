//package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		String searchType = "Binary Recursive Search";
		return searchType;
	}

	@Override
	public int search(int[] arr, int target) {
		return search(arr, target, 0, arr.length-1);
	}
	
	public int search(int[] arr, int target, int min, int max) {
		//if min and max cross, target is not in the array
		if(min > max) {
			return -1;
		}
		int mid = (min + max)/2;
		if(arr[mid] == target) {
			return mid;
		}
		//if mid > target, delete the second half of the array: set mid - 1 to max
		if(arr[mid] > target) {
			return search(arr, target, min, mid - 1);
		}
		//else: delete top half of the array: set min to mid + 1
		else {
			return search(arr, target, mid + 1, max);
		}
		
	}

}
