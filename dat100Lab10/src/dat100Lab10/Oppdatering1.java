package dat100Lab10;

public class Oppdatering1 {
	
	 public static void main(String[] args) {

		  int[] tab = {1,2,3,4,5,6};

		  // skriv ut
		    System.out.print("[ ");

		  for (int x : tab) {
		  System.out.print(x + " ");
		  }

		  System.out.println("]");

		  // oppdater
//		  for (int x : tab) {
//		  x = x + 1;
//		  }
		  
		  for (int i=0;i<tab.length;i++) {
			  tab[i]+=1;
			  }
		  
		  // skriv ut
		  System.out.print("[ ");

		  for (int x : tab) {
		  System.out.print(x + " ");
		  }
		  System.out.println("]");

	 }
}