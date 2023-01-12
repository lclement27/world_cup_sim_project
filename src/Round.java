import java.util.ArrayList;
import java.util.List;
import java.lang.IllegalArgumentException;


/**
 * Abstract class for a generic Round of the World Cup
 * @author lucasclement
 *
 */
public abstract class Round {
	
	protected List<List<Country>> matches;
	protected List<Country> winners;
	
	/**
	 * 1 argument constructor taking a list of Countries to participate in the Round
	 * @param teams	List of Countries to participate
	 * @throws IllegalArgumentException
	 */
	public Round(List<Country> teams) throws IllegalArgumentException{
		
		// check through all the teams to check if there are repeated ranks
		for (int i=0; i<teams.size();i++) {
			for(int j=0;j<teams.size();j++) {
				// if the two teams being looked at are the same, move on
				if (teams.get(i) == teams.get(j)) {
					continue;
				}
				// if teams have the same rank, throw an exception
				if (teams.get(i).sameRank(teams.get(j))) {
					throw new IllegalArgumentException("Two teams cannot have the same rank");
				}
			}
		}
		
		if (teams.size() % 2 != 0) {
			throw new IllegalArgumentException("Incorrect number of teams");
		}
		
		// if no exceptions, construct the round
		List<List<Country>> matches = new ArrayList<List<Country>>();
		// match up countries by the one next to it
		for (int i=0; i<teams.size(); i+=2) {
			List<Country> match = new ArrayList<Country>();
			Country teamOne = teams.get(i);
			Country teamTwo = teams.get(i+1);
			match.add(teamOne);
			match.add(teamTwo);
			matches.add(match);
		}
		this.matches = matches;
		this.winners = new ArrayList<Country>();
	}
	
	@Override
	public String toString() {
		String matchesString = "";
		for (List<Country> match : this.matches) {
			matchesString += match.get(0) +" vs. "+ match.get(1) +"; ";
		}
		return matchesString;
	}
	
	

}