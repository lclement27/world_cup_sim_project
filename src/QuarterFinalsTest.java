import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class QuarterFinalsTest {

	private Round qf;
	private Country eng;
	private Country arg;
	private Country ita;
	private Country ger;
	private Country sen;
	private Country ned;
	private Country can;
	private Country mex;

	
	private List<Country> countries;
	
	@Before
	public void setup() {
		eng = new Country("England", 1);
		arg = new Country("Argentina", 2);
		ita = new Country("Italy", 3);
		ger = new Country("Germany", 4);
		sen = new Country("Senegal", 5);
		ned = new Country("Netherlands", 6);
		can = new Country("Canada", 7);
		mex = new Country("Mexico", 8);

		countries = new ArrayList<Country>();
		countries.add(eng);
		countries.add(arg);
		countries.add(ita);
		countries.add(ger);
		countries.add(sen);
		countries.add(ned);
		countries.add(can);
		countries.add(mex);
		qf = new QuarterFinals(countries);
	}

	@Test
	public void testConstructor() {
		List<Country> firstList = new ArrayList<Country>();
		firstList.add(eng);
		firstList.add(arg);
		List<Country> secondList = new ArrayList<Country>();
		secondList.add(ita);
		secondList.add(ger);
		List<Country> thirdList = new ArrayList<Country>();
		thirdList.add(sen);
		thirdList.add(ned);
		List<Country> fourthList = new ArrayList<Country>();
		fourthList.add(can);
		fourthList.add(mex);
		List<List<Country>> outerList = new ArrayList<List<Country>>();
		outerList.add(firstList);
		outerList.add(secondList);
		outerList.add(thirdList);
		outerList.add(fourthList);
		List<Country> emptyList = new ArrayList<Country>();
		assertEquals(outerList, qf.matches);
		assertEquals(emptyList, qf.winners);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTooManyCountries() {
		Country par = new Country("Paraguay", 2);
		countries.add(par);
		@SuppressWarnings("unused")
		Round badQf = new QuarterFinals(countries);
		
	}

}

