package dat100Lab10;
import java.util.Random;

public class Terning {

	// aktuell verdi for terningen
	private int oyne;
	private Random random=new Random();

	public Terning() {	
	}

	public int getOyne() {
	oyne=random.nextInt(6)+1;
	
	return oyne;
	}

	public void trill() {
		
	}
}

