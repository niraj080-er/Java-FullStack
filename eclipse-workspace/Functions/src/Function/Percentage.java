package Function;

public class Percentage {
	static void totalpercentage(int p, int c, int m, int o) {
		int total = p+c+m+o;
		float pesrc=total/4.0f;
		System.out.println(pesrc);
	}
	public static void main(String[] args) {
		totalpercentage(50,70,70,80);
	}

}
