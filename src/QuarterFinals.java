import java.util.List;
import java.lang.IllegalStateException;

/**
 * QuarterFinal round of the World Cup with 8 teams and 4 winners
 * @author lucasclement
 *
 */
public class QuarterFinals extends Round{

	/**
	 * 1 argument constructor to create the round
	 * @param teams	List of Countries to play in the round
	 * @throws IllegalStateException
	 */
	public QuarterFinals (List<Country> teams) throws IllegalStateException{
		super(teams);
		// check that there are 16 teams in the round, throw exception if more or less
		if (teams.size() != 8) {
			throw new IllegalStateException("Only 8 teams can be in the Quarterfinals");
		}	
	}
}