package dat100Lab10;

import java.util.Random;

public class TestMetode {

	public static void main(String[] args) {
		Simulering h=new Simulering();
		
		h.simTab();
		h.SkriveUt();
		h.terTab();
		h.SkriveUt2();
		
		int enere=1;
		
		System.out.println("antall " +enere+"-ere = "+h.terTab()[enere]);
	
	}

}
