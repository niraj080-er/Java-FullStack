package jsp;

public class Pen {
	String Brand;
	String color;
	Double price;
	public Pen(String brand, String color, Double price) {
		super();
		Brand = brand;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pen [Brand=" + Brand + ", color=" + color + ", price=" + price + "]";
	}
	


}
