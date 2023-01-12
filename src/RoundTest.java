import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import java.util.List;
import java.util.ArrayList;

public class RoundTest {
	
	private Round semis;
	private Country eng;
	private Country arg;
	private Country ita;
	private Country ger;
	private List<Country> countries;
	
	@Before
	public void setup() {
		eng = new Country("England", 1);
		arg = new Country("Argentina", 2);
		ita = new Country("Italy", 3);
		ger = new Country("Germany", 4);
		countries = new ArrayList<Country>();
		countries.add(eng);
		countries.add(arg);
		countries.add(ita);
		countries.add(ger);
		semis = new SemiFinals(countries);
	}

	@Test
	public void testConstructor() {
		List<Country> firstList = new ArrayList<Country>();
		firstList.add(eng);
		firstList.add(arg);
		List<Country> secondList = new ArrayList<Country>();
		secondList.add(ita);
		secondList.add(ger);
		List<List<Country>> outerList = new ArrayList<List<Country>>();
		outerList.add(firstList);
		outerList.add(secondList);
		List<Country> emptyList = new ArrayList<Country>();
		assertEquals(outerList, semis.matches);
		assertEquals(emptyList, semis.winners);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testFailedConstructor() {
		
		Country sen = new Country("Senegal", 4);
		countries.add(sen);
		@SuppressWarnings("unused")
		Round badSemis = new SemiFinals(countries);	// two countries with the same rank
		
	}
	
	@Test
	public void testToString() {
		String testString = "England vs. Argentina; Italy vs. Germany; ";
		assertEquals(testString, semis.toString());
	}

}
