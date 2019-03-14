// Duy Do Quoc, 01622040	Sarah Maria Tomola, 11820646

import java.util.*;

public class MyMeasureableDemo {

	public static void main (String[] args) {
		
		//zwei Teams, die je 10 Spiele (Fussball) gespielt haben
		Result[] teams = {
			new Result("Team1", 10),
			new Result("Team2", 10)
		};
		
		for(int i = 0; i < teams.length; i++)
			setScore(teams[i]);
		System.out.println(teams[0].toString());
		
		Prozent v = new Prozent("Viktor", 6, 12);
		System.out.println(v.toString());
		
		Measurable[] werte = {
			teams[0],
			teams[1],
			new Prozent("Bob", 3, teams[0].getTotalScore()),		//int - da es nur ganze Tore gibt
			new Prozent("Alice", 5, teams[1].getTotalScore()),
			null
		};

		Utilities uti = new Utilities();
		for(int i = 0; i < werte.length; i++) {
			uti.access(werte[i]);
		}		
	}
	
	//Random Werte werden dem jeweiligen Team zugewiesen
	public static void setScore(Result team) {
		Random r = new Random();
		for(int i = 0; i < team.getAnz(); i++)
			team.setScore(i, r.nextInt(5) + 1);		//es wurde immer mind. ein Tor geschossen
	}
}