import java.text.*;
public class FormatosNumericos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C1=0.097796;
		DecimalFormat F1;
		F1 = new DecimalFormat("#.##%");
		System.out.printf("Taxa de crescimento = %s",  F1.format(C1));
	}

}
