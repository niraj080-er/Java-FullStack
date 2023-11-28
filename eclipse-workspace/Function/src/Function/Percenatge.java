package Function;

 public class Percenatge {
	static void totalPercentage(int p, int c , int m, int o) {
		int total=p+c+m+o;
		float percentage=total/4.0f;
		System.out.println("Total percentage = "+percentage);	
	}
	public static void main(String[] args) {
		totalPercentage(56,89,88,90);
	}

}
