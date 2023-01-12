import java.util.List;

/**
 * Interface for the World Cup View
 * @author lucasclement
 *
 */
public interface WorldCupView{
	
	/**
	 * Display the Round of 16 onto the GUI
	 * @param ros
	 */
	public void displayRos(Round ros);
	
	/**
	 * Display the QuarterFinal onto the GUI
	 * @param qf
	 */
	public void displayQf(Round qf);
	
	/**
	 * Display the SemiFinal onto the GUI
	 * @param sf
	 */
	public void displaySf(Round sf);
	
	/**
	 * Display the Finals onto the GUI
	 * @param finals
	 */
	public void displayFinals(Round finals);
	
	/**
	 * Display the winner of the World Cup onto the GUI
	 * @param finals
	 */
	public void displayWinner(Round finals);
	
	/**
	 * Transform a List of countries as a string into Country objects
	 * @param list	a List of countries as a string
	 * @return	a List of Country objects
	 */
	public List<Country> getCountries(List<String> list);
	
	/**
	 * Creates an Input button on the GUI to allow for user file selection
	 */
	public void createInputButton();
	
	/**
	 * Creates a Play button that plays a round of the World Cup upon press
	 */
	public void createPlayButton();
	
	/**
	 * Checks if there is currently a file being taken in
	 * @return	boolean if there is a file
	 */
	public boolean fileTaken();
	
	/**
	 * Gets the teams that are stored in View after reading the file
	 * @return	List of Countries read from an input file
	 */
	public List<Country> getTeams();
	
	/**
	 * Get the number of clicks on a button
	 * @return	number of clicks
	 */
	public int getClickCount();
	

}