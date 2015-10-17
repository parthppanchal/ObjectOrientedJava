package week5.searching;

public class Search {
	public static String linearSearch(String toFind, Airport[] airports) {
		int i = 0;
		while (i < airports.length) {
			Airport curr = airports[i];
			if (toFind.equals(curr.getCity())) {
				return curr.getCode3();
			}
			i++;
		}
		return "Sorry, we couldn't find " + toFind;
	}
	
	public static String binarySearch(String toFind, Airport[] airports) {
		int low = 0,
				high = airports.length - 1,
				mid;
		while(low <= high) {
			mid = low + (high - low)/2;
			Airport curr = airports[mid];
			int comparison = toFind.compareTo(curr.getCity());
			if(comparison == 0) {
				return curr.getCode3();
			} else if(comparison > 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return "Sorry, we couldn't find " + toFind;
	}
}
