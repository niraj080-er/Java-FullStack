package jspider.com.p1;

public class Location {
	private double latitude;
	private double longitude;
	private String direction;
	public Location(double latitude, double longitude, String direction) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.direction = direction;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
}
