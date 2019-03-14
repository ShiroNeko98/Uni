// Duy Do Quoc, 01622040	Sarah Maria Tomola, 11820646

public class Utilities {

	private static int count = 1;
	
	public static void showMeasure(Measurable m) {
		if(m != null) {
			System.out.println(count + ": " + m.getMeasure());
			count++;
		}		
	}
	
	public void access(Measurable m) {
		showMeasure(m);
	}
}