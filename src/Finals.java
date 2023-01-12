import java.util.List;

/**
 * Implementation of the Finals of the World Cup
 * @author lucasclement
 *
 */
public class Finals extends Round {
	
	/**
	 * 1 argument constructor calling the super class constructor
	 * @param teams	List of Countries to play in the round
	 * @throws IllegalStateException
	 */
	public Finals (List<Country> teams) throws IllegalStateException{
		super(teams);
		// check that there are 16 teams in the round, throw exception if more or less
		if (teams.size() != 2) {
			throw new IllegalStateException("Only 8 teams can be in the Quarterfinals");
		}		
	}
}