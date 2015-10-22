package week5.basic_sorting;

public class Sort {
	
	public static void swap(int[] vals, int index1, int index2) {
		int temp = vals[index1];
		vals[index1] = vals[index2];
		vals[index2] = temp;
	}
	
	public static void selectionSort(int[] toSort) {
		for(int i = 0; i < toSort.length-1; i++) {
			int indexOfSmallest = i;
			boolean swap = false;
			for(int j = i + 1; j < toSort.length; j++) {
				if(toSort[indexOfSmallest] > toSort[j]) {
					indexOfSmallest = j;
					swap = true;
				}
			}
			if(swap) {
				swap(toSort, indexOfSmallest, i);
			}
		}
	}
	

	public static void insertionSort(int[] vals) {
		int currInd;
		for(int pos=1; pos < vals.length; pos++) {
			currInd = pos;
			while(currInd > 0 && vals[currInd] < vals[currInd-1]) {
				swap(vals, currInd, currInd-1);
				currInd = currInd - 1;
			}
		}
	}
	
	public static void printArray(int[] vals) {
		int i = 0;
		for(i=0; i < vals.length-1; i++) {
			System.out.print(vals[i] + ", ");
		}
		System.out.println(vals[i]);
	}
	
	public static void main(String[] args) {
		int[] toSort = new int[] {7, 16, 66, 43, 97, 51};
		System.out.print("Selection sort: ");
		selectionSort(toSort);
		printArray(toSort);
		toSort = new int[] {7, 16, 66, 43, 97, 51};
		System.out.print("Mystery sort: ");
		insertionSort(toSort);
		printArray(toSort);
	}
}
