import java.util.List;

/**
 * Model interface to run the world cup simulation
 * @author lucasclement
 *
 */
public interface WorldCup  { 
	
	/**
	 * Plays a round of the World Cup
	 * @param round Round to be played
	 */
	public void playRound(Round round);
	
	/**
	 * Gets the winners of a certain Round
	 * @param round	ROund you want the winners from
	 * @return	List of winning Countries from the round
	 */
	public List<Country> getWinners(Round round);
	
	/**
	 * Gets the matches to be played in a certain Round
	 * @param round	Round you want the matches from
	 * @return	List of a List of two teams for a given match
	 */
	public List<List<Country>> getMatches(Round round);
	
	/**
	 * Gets the teams playing in a certain Round
	 * @param round	Round you want the teams from
	 * @return	List of Countries playing in the Round
	 */
	public List<Country> getTeams(Round round);
}