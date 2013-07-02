
public class DatasCronologicas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long Agora = System.currentTimeMillis();
		// TODO Auto-generated method stub
		System.out.println(String.format("%1$td/%1$tm/%1$ty %1$tH:%1$tm:%1$tS", Agora));
		System.out.println(String.format("%1$td/%1$tm/%1$ty", Agora));
		System.out.println(String.format("%1$tD", Agora));
		System.out.println(String.format("%1$tT", Agora));
		System.out.println(String.format("%1$tD %1$tT", Agora));
	}

}
