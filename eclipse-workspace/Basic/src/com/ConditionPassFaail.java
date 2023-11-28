package com;

public class ConditionPassFaail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String result=null;
		int phy=83;
		int chy=75;
		int math=82;
		int aditional=82;
		int total = phy+chy+math+aditional;
		float percentage = total/400.0f*100.f;
		String result=null;
		if(percentage>=35) {
			result = "pass";	
		}
		if(percentage<35) {
			result="fail";
		}
		System.out.println(total);
		System.out.println(percentage);
		System.out.println(result);

	}

}
