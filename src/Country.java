//import java.util.List;

/**
 * Class representing a Country which has a name and a ranking
 * @author lucasclement
 *
 */
public class Country {
	
	protected String name;
	protected int rank;
	
	/**
	 * 2 argument constructor to create the Country object
	 * @param name	name of the country
	 * @param rank	ranking of the country
	 */
	public Country(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	
	 
	/**
	 * Get the name of the Country
	 * @return	name of the Country
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Get the rank of the Country
	 * @return	rank of the Country
	 */
	public int getRank() {
		return this.rank;
	}
	
	/**
	 * Check if two Countries have the same ranking
	 * @param other	a Country to compare to
	 * @return	boolean if the ranks are the same
	 */
	public boolean sameRank(Country other) {
		if (this.rank == other.rank) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String country = this.rank + ". "+this.name;
		return country;
	}
}