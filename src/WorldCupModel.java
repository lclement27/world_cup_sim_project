import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Implementation of the World Cup interface as the model.
 * @author lucasclement
 *
 */
public class WorldCupModel implements WorldCup {

	@Override
	public void playRound(Round round) {
		// TODO Auto-generated method stub
		for (List<Country> match : round.matches) {
			// get both teams
			Country t1 = match.get(0);
			Country t2 = match.get(1);
			// instantiate a winner as null, to be updated at the end
			Country winner = null;
			//get the rank difference between the two teams 
			int diff = Math.abs(t1.getRank() - t2.getRank());
			// weight the win probabilities based on the difference
			double probDiff = diff * 1.5;	
			// default probabilities
			double winSplit = 50;
			
			// add the weight to the higher ranked team, deduct from the lower ranked team
			if (t1.getRank() > t2.getRank()) {
				winSplit -= probDiff; 
				
			}
			else {
				winSplit += probDiff; 
			
			}
			
			// get a random winner from 1-100
			Random rand = new Random();
			double randWinner = rand.nextDouble() * 100;
			while (randWinner == winSplit) {
				randWinner = rand.nextDouble() * 100;
			}
			
			if (0 < randWinner && randWinner < winSplit) {
				winner = t1;
			}
			if(winSplit < randWinner && randWinner < 100) {
				winner = t2;
			}
			
			round.winners.add(winner);
			
		}
	}

	@Override
	public List<Country> getWinners(Round round) {
		// TODO Auto-generated method stub
		if (round.winners.size() < round.matches.size()/2) {
			throw new IllegalStateException("Winners have not been determined yet");
		}
		else {
			return round.winners;
		}
	}

	@Override
	public List<List<Country>> getMatches(Round round) {
		// TODO Auto-generated method stub
		return round.matches;
	}

	@Override
	public List<Country> getTeams(Round round) {
		// TODO Auto-generated method stub
		List<Country> teams = new ArrayList<Country>();
		for (int i=0; i<round.matches.size();i++) {
			for(int j=0; j<round.matches.get(i).size();j++) {
				teams.add(round.matches.get(i).get(j));
			}
		}
		return teams;
	}
	
	
}