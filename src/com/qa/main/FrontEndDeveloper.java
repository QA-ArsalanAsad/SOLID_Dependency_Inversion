package com.qa.main;

public class FrontEndDeveloper implements Developer {

	@Override
	public void develops() {
		writeJavaScript();
		
	}
	
	public void writeJavaScript() {
		System.out.println("Javascript is used everywhere anyway");
	}
	

}
