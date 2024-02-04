package polymarphism.com;

class Hotel{
	public void typefood(){
		System.out.println("food");
	}
}
class VegFood extends Hotel{
	public void typefood(){
		System.out.println("Veg food");
	}
}
class NonVegFood extends Hotel{
	public void typefood(){
		System.out.println("Non veg food ");
	}
}
class Food{
	public void checkFood(Hotel a1) {
		a1.typefood();
	}
}
public class RunTimePolymorphism {
	public static void main(String[] args) {
		Hotel a1 =new Hotel();
		VegFood v1= new VegFood();
		NonVegFood v2=new NonVegFood();
		Food f1= new Food();
		f1.checkFood(a1);
		f1.checkFood(v1);
		f1.checkFood(v2);
		
	}
}
