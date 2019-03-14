// Duy Do Quoc, 01622040	Sarah Maria Tomola, 11820646

public class Result implements Measurable{
	
	private String name;
	private double[] erg;
		
	//constructor for setting the name and the number of scores
	public Result(String name, int scores) {
		this.name = name;
		erg = new double[scores];
	}
	
	//Interface Measurable
	//returns the specific measure
	public double getMeasure() {
		return getTotalScore();
	}
	
	//sets the i-th score with the given amount
	public void setScore (int i, double amount) {
		erg[i] = amount;
	}
	
	//returns the i-th score
	public double getScore(int i) {
		return erg[i];
	}
	
	//returns the total score (= sum of all scores)
	public double getTotalScore() {
		double score = 0;
		for(int i = 0; i < erg.length; i++)
			score += erg[i];
		return score;
	}
	
	public int getAnz() {
		return erg.length;
	}
	
	//returns a string representation of the name combinded with all
	// scores and the total score
	public String toString() {
		String help = name + ":";
		for(int i = 0; i < erg.length - 1; i++) {
			help += " " + erg[i] + " /";
		}
		help += " " + erg[erg.length - 1] + " = " + getTotalScore();
		return help;
	}
}