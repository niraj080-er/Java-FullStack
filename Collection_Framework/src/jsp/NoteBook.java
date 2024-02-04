package jsp;

public class NoteBook {
	String Brand;
	Double price;
	Integer page;
	public NoteBook(String brand, Double price, Integer page) {
		super();
		Brand = brand;
		this.price = price;
		this.page = page;
	}
	@Override
	public String toString() {
		return "NoteBook [Brand=" + Brand + ", price=" + price + ", page=" + page + "]";
	}

}
