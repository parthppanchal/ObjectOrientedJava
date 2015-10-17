package week5.searching;

public class Airport implements Comparable<Airport>{
	private String name;
	private String city;
	private String country;
	private String code3;
	
	public Airport(String name, String city, String country, String code3) {
		this.name = name;
		this.city = city;
		this.country = country;
		this.code3 = code3;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCity() {
		return this.city;
	}

	public String getCountry() {
		return this.country;
	}
	
	public String getCode3() {
		return this.code3;
	}
	
	public int compareTo(Airport other) {
		return this.city.compareTo(other.getCity());
	}
}
