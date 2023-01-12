import java.util.List;
import java.lang.IllegalArgumentException;

/**
 * Implementation of the SemiFinals of the World Cup
 * @author lucasclement
 *
 */
public class SemiFinals extends Round {
	
	/**
	 * 1 argument constructor calling the super class constructor
	 * @param teams List of Countries to play in the round
	 * @throws IllegalArgumentException
	 */
	public SemiFinals (List<Country> teams) throws IllegalArgumentException{
		super(teams);
		// check that there are 16 teams in the round, throw exception if more or less
		if (teams.size() != 4) {
			throw new IllegalArgumentException("Only 8 teams can be in the Quarterfinals");
		}	
	}


	
	
}