package week5.basic_sorting;

import java.util.*;

public class MyBuiltInSortingTest {
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> numsToSort = new ArrayList<Integer>();
		
		for(int i=0; i < 5; i++) {
			numsToSort.add(random.nextInt(100));
		}
		
		Collections.sort(numsToSort);
		System.out.println("New array after builtin sort: " + numsToSort.toString());
	}
}
