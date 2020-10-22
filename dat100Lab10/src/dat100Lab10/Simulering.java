package dat100Lab10;

public class Simulering {
	private int z = 100;
	private int[] simuleringsTabel = new int[z];
	private int[] terningkastene;
	

	Terning g = new Terning();

	public int[] simTab() {
		for (int i = 0; i < simuleringsTabel.length; i++) {
			simuleringsTabel[i] = g.getOyne();
		}
		return simuleringsTabel;
	}

	public int[] terTab() {
		terningkastene = new int[7];
		int i = 0;
		int kast = simuleringsTabel[i];
		while (kast>0 && i < z) {
			terningkastene[kast]++;
			i++;
			kast=simuleringsTabel[i-1];
		}
		return terningkastene;
	}

	public void SkriveUt() {
		int tabIndekst = 0;
		for (int j = 0; j < 5; j++) {

			int i = 0;
			while (i < 20) {
				int n = simuleringsTabel[tabIndekst];
				System.out.print(n + "\t");

				tabIndekst++;
				i++;

			}
			System.out.println("\n");
		}
	}
	
	
	public void SkriveUt2() {
		System.out.print("[");
		for (int j = 0; j < terningkastene.length; j++) {
			System.out.print(terningkastene[j]+ " ");	
		}System.out.println("]\n");
	}
	
	

}
