import static org.junit.Assert.*;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class WorldCupModelTest {
	
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
	private Round finals;
	private Round semis;
	private Round quarters;
	private Round ros;
	private WorldCup wc = new WorldCupModel();

	
	
	public void setupFinals() {
		eng = new Country("England", 1);
		arg = new Country("Argentina", 2);
		countries = new ArrayList<Country>();
		countries.add(eng);
		countries.add(arg);
		finals = new Finals(countries);
	}
	
	public void setupSemis() {
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
	
	public void setupQuarters() {
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
		quarters = new QuarterFinals(countries);
	}
	
	public void setupRos() {
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
	public void testPlayFinalsRound() {
		setupFinals();
		assertEquals(0, finals.winners.size());
		wc.playRound(finals);
		assertEquals(1, finals.winners.size());
	}
	
	@Test
	public void testPlaySemisRound() {
		setupSemis();
		assertEquals(0, semis.winners.size());
		wc.playRound(semis);
		assertEquals(2, semis.winners.size());
	}
	
	@Test
	public void testPlayQuartersRound() {
		setupQuarters();
		assertEquals(0, quarters.winners.size());
		wc.playRound(quarters);
		assertEquals(4, quarters.winners.size());
	}
	
	@Test
	public void testPlayRoundOfSixteen() {
		setupRos();
		assertEquals(0, ros.winners.size());
		wc.playRound(ros);
		assertEquals(8, ros.winners.size());
	}
	
	@Test 
	public void testGetMatches() {
		setupSemis();
		List<Country> innerOne = new ArrayList<Country>();
		innerOne.add(eng);
		innerOne.add(arg);
		List<Country> innerTwo = new ArrayList<Country>();
		innerTwo.add(ita);
		innerTwo.add(ger);
		List<List<Country>> test = new ArrayList<List<Country>>();
		test.add(innerOne);
		test.add(innerTwo);
		assertEquals(test, wc.getMatches(semis));
	}
	
	@Test 
	public void testGetTeams() {
		setupSemis();
		List<Country> test = new ArrayList<Country>();
		test.add(eng);
		test.add(arg);
		test.add(ita);
		test.add(ger);
		assertEquals(test, wc.getTeams(semis));
	}
	
	@Test(expected = IllegalStateException.class)
	public void testIllegalWinnersCall() {
		setupRos();
		wc.getWinners(ros);
	}
	
	@Test
	public void testGetWinners() {
		setupQuarters();
		wc.playRound(quarters);
		assertEquals(4, wc.getWinners(quarters).size());
	}
	
	

}
