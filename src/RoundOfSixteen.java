import java.util.List;
import java.lang.IllegalArgumentException;

/**
 * Implementation of the Round of Sixteen of the World Cup
 * @author lucasclement
 *
 */
public class RoundOfSixteen extends Round {

	/**
	 * 1 argument constructor calling the super class constructor
	 * @param teams	List of Countries to participate
	 * @throws IllegalArgumentException
	 */
	public RoundOfSixteen(List<Country> teams) throws IllegalArgumentException{
		super(teams);
		// check that there are 16 teams in the round, throw exception if more or less
		if (teams.size() != 16) {
			throw new IllegalArgumentException("Only 16 teams can be in the round of 16");
		}
	}

}