// Duy Do Quoc, 01622040	Sarah Maria Tomola, 11820646

//berechnet z.B.: Notenspiegel in Prozent
public class Prozent implements Measurable {
	
	private String name;
	private double anz;			//z.B. Anzahl der jeweiligen Noten
	private double ges;			//z.B. Gesamtanzahl der Studenten
	
	public Prozent(String name, double anz, double ges) {
		this.name = name;
		this.anz = anz;
		this.ges = ges;
	}
	
	//Interface Measurable
	//returns the specific measure
	public double getMeasure() {
		return cal_Prozent();
	}
	
	public double cal() {
		return (anz / ges);
	}
	
	public double cal_Prozent() {
		return (cal() * 100);
	}
	
	public double getGes() {
		return ges;
	}
	
	public String toString() {
		return name + ": " + anz + " von " + ges + " .... " + cal_Prozent() + " %";
	}
}