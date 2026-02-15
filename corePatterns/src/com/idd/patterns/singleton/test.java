package com.idd.patterns.singleton;

public class test {
	public static void main(String[] args) {
		DateUtil dateUtil = DateUtil.getInstance();
		DateUtil dateUtil1 = DateUtil.getInstance();
		System.out.println("Lazy singleton "+ (dateUtil == dateUtil1) );
		
		DateUtil_Eager eager1=DateUtil_Eager.getInstance();
		DateUtil_Eager eager2=DateUtil_Eager.getInstance();
		System.out.println("Eager singleton "+(eager1==eager2));
	}
}
