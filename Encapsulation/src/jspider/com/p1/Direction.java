package jspider.com.p1;

public class Direction {
	private String startingPoint;
	private String endingPoint;
	private String direction;
	public Direction(String startingPoint, String endingPoint, String direction) {
		this.startingPoint = startingPoint;
		this.endingPoint = endingPoint;
		this.direction = direction;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getEndingPoint() {
		return endingPoint;
	}
	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
}