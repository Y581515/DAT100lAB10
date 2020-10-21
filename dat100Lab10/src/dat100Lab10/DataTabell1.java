package dat100Lab10;

public class DataTabell1 {
	
	
	public static void main(String[] args) {

		Data1[] tab = new Data1[3];

		tab[0] = new Data1(1);
		tab[1] = new Data1(2);
		tab[2] = new Data1(3);

		for (Data1 d : tab) {
			System.out.print(d + " ");
		}
		System.out.println();

		for (Data1 d : tab) {
			d.setData(d.getData() + 1);
		}


		for (Data1 d : tab) {
			System.out.print(d + " ");
		}
		System.out.println();

	}

}