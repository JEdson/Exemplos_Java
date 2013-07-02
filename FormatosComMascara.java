import java.text.*;
public class FormatosComMascara {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double R1=0.456789;
		double R2=7.0;
		DecimalFormat F1,F2;
		F1= new DecimalFormat("#.##");
		System.out.printf("Formato #.#: %s e %s", F1.format(R1), F1.format(R2));
		F2= new DecimalFormat("0.0");
		System.out.printf("\nFormato 0.0: %s e %s", F2.format(R1),F2.format(R2));
	}

}
