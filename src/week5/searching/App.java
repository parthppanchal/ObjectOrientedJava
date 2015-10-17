package week5.searching;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.opencsv.CSVReader;

public class App {
	public static String findAirportCode(String toFind, Airport[] airports) {
		Arrays.sort(airports);
		return Search.binarySearch(toFind, airports);
	}

	public static Airport[] readCSV(String csvFile, int noOfRecords) {
		CSVReader reader = null;
		String[] airport = null;
		Airport[] airports = new Airport[noOfRecords];
		int i = 0;
		try {
			reader = new CSVReader(new FileReader(csvFile));
			while((airport = reader.readNext()) != null){
	        	airports[i] = new Airport(airport[1], airport[2], airport[3], airport[4]);
	        	i++;
	        }
			return airports;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		final String csvFile = "data/airports.dat";
		Airport[] airports = readCSV(csvFile, 8107);
		System.out.println(findAirportCode("Bangalore", airports));
	}
}