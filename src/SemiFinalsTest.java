import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SemiFinalsTest {

	private Round sf;
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
		sf = new SemiFinals(countries);
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
		assertEquals(outerList, sf.matches);
		assertEquals(emptyList, sf.winners);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTooManyCountries() {
		Country par = new Country("Paraguay", 2);
		countries.add(par);
		@SuppressWarnings("unused")
		Round badSf = new SemiFinals(countries);
		
	}

}
