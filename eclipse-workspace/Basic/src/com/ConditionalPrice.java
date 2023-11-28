package com;

public class ConditionalPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flavourcode=3;
		int price =0;
		String flavour=null;
		boolean toping=true;
		boolean dryfruits=true;
		if(flavourcode==1) {
			price=100;
			flavour="vanila";
		}
		if(flavourcode==2) {
			price=120;
			flavour="Butter-scotch";	
		}
		if(flavourcode==3) {
			price=130;
			flavour="kiwi";	
		}
		if(toping==true) {
			price=price+15;
			
		}
		if(dryfruits==true) {
			price=price+15;
		}
		float gst = price*0.18f;
		float total = price+gst;
		System.out.println(flavourcode);
		System.out.println(flavour);
		System.out.println(toping);
		System.out.println(dryfruits);
		System.out.println(price);
		System.out.println(gst);
		System.out.println(total);
		

	}

}
