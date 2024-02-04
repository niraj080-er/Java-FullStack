package jspider.com.p1;

public class Demo2 {
	void diplay() {
		Demo1 b1= new Demo1();
		//System.out.println(b1.var1); // can Not be Access because it have the  private access specifier
		System.out.println(b1.var2);
		System.out.println(b1.var3);
		System.out.println(b1.var4);
	}

}