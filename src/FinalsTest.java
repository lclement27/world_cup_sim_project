import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FinalsTest {

	private Round finals;
	private Country eng;
	private Country arg;


	
	private List<Country> countries;
	
	@Before
	public void setup() {
		eng = new Country("England", 1);
		arg = new Country("Argentina", 2);


		countries = new ArrayList<Country>();
		countries.add(eng);
		countries.add(arg);
		finals = new Finals(countries);
	}

	@Test
	public void testConstructor() {
		List<Country> firstList = new ArrayList<Country>();
		firstList.add(eng);
		firstList.add(arg);
		List<List<Country>> outerList = new ArrayList<List<Country>>();
		outerList.add(firstList);
		List<Country> emptyList = new ArrayList<Country>();
		assertEquals(outerList, finals.matches);
		assertEquals(emptyList, finals.winners);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTooManyCountries() {
		Country par = new Country("Paraguay", 2);
		countries.add(par);
		@SuppressWarnings("unused")
		Round badFinals = new Finals(countries);
		
	}


}
