import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class RoundOfSixteenTest {
	
	private Round ros;
	private Country eng;
	private Country arg;
	private Country ita;
	private Country ger;
	private Country sen;
	private Country ned;
	private Country can;
	private Country mex;
	private Country mor;
	private Country egy;
	private Country chi;
	private Country aus;
	private Country cam;
	private Country ind;
	private Country gha;
	private Country qat;
	
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
		mor = new Country("Morocco", 9);
		egy = new Country("Egpyt", 10);
		chi = new Country("China", 11);
		aus = new Country("Australia", 12);
		cam = new Country("Cameroon", 13);
		ind = new Country("India", 14);
		gha = new Country("Ghana", 15);
		qat = new Country("Qatar", 16);
		countries = new ArrayList<Country>();
		countries.add(eng);
		countries.add(arg);
		countries.add(ita);
		countries.add(ger);
		countries.add(sen);
		countries.add(ned);
		countries.add(can);
		countries.add(mex);
		countries.add(mor);
		countries.add(egy);
		countries.add(chi);
		countries.add(aus);
		countries.add(cam);
		countries.add(ind);
		countries.add(gha);
		countries.add(qat);
		ros = new RoundOfSixteen(countries);
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
		List<Country> fifthList = new ArrayList<Country>();
		fifthList.add(mor);
		fifthList.add(egy);
		List<Country> sixthList = new ArrayList<Country>();
		sixthList.add(chi);
		sixthList.add(aus);
		List<Country> seventhList = new ArrayList<Country>();
		seventhList.add(cam);
		seventhList.add(ind);
		List<Country> eigthList = new ArrayList<Country>();
		eigthList.add(gha);
		eigthList.add(qat);
		List<List<Country>> outerList = new ArrayList<List<Country>>();
		outerList.add(firstList);
		outerList.add(secondList);
		outerList.add(thirdList);
		outerList.add(fourthList);
		outerList.add(fifthList);
		outerList.add(sixthList);
		outerList.add(seventhList);
		outerList.add(eigthList);
		List<Country> emptyList = new ArrayList<Country>();
		assertEquals(outerList, ros.matches);
		assertEquals(emptyList, ros.winners);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTooManyCountries() {
		Country par = new Country("Paraguay", 17);
		countries.add(par);
		@SuppressWarnings("unused")
		Round badRos = new RoundOfSixteen(countries);
		
	}

}
