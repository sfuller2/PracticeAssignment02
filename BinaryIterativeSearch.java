package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		String searchType = "Binary Iterative Search";
		return searchType;
	}

	@Override
	public int search(int[] arr, int target) {
		int min = 0;
		int max = arr.length - 1;
		int mid;
		while (min < max) {
			mid = (min + max)/2;
			//if they are equal, return mid
			if (arr[mid] == target) {
				return mid;
			}
			//if mid > target, delete bottom half of the array: set max to mid - 1
			if (arr[mid] > target) {
				max = mid - 1;
			}
			// else, delete top half of the array: set min to mid + 1
			else {
				min = mid + 1;
			}
		}
		//or it's not in the array
		return -1;
	}

}
