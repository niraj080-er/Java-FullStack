package jsp;
public class Boxing_Operation {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Integer i1=new Integer (100);
		Double d1=new Double(34.3);
		Float f1=new Float(2.23f);
		Long l1=new Long(909937l);
		Short s1=new Short((short) 8);
		Character c1=new Character('h');
		Boolean b=new Boolean(false);
		System.out.println(i1);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(l1);
		System.out.println(s1);
		System.out.println(c1);
		System.out.println(b);
		System.out.println("-----HashCode-----");
		System.out.println(i1.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(f1.hashCode());
		System.out.println(l1.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(b.hashCode());

		
		
	}

}
