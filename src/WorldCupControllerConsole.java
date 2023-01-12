
/**
 * Implementation of the WorldCUpController
 * @author lucasclement
 *
 */
public class WorldCupControllerConsole implements WorldCupController {
	
	public WorldCup wc;
	public WorldCupView view;
	
	/**
	 *  2 argument constructor taking the model and view
	 * @param wc	WorldCup Model
	 * @param view	WorldCup View
	 */
	public WorldCupControllerConsole(WorldCup wc, WorldCupView view) {
		this.wc  = wc;
		this.view = view;
	}
	
	// for some reason does not work without the print statements
	@Override
	public void go(){
		// create buttons in view
		view.createInputButton();
		// allow view to take in file
		boolean moveOn = view.fileTaken();
		while (moveOn == false) {
			System.out.println(moveOn);
			moveOn = view.fileTaken();
		}
		
		System.out.println("Show teams now");
		view.createPlayButton();
		// create RoundOfSixteen and display
		Round ros = new RoundOfSixteen(view.getTeams());
		Round qf = null;
		Round sf = null;
		Round finals = null;
		view.displayRos(ros);
		
		// play round and show next round once the button has been clicked in the view
		int clicks = view.getClickCount();
		while (clicks < 1) {
			System.out.println("in first while loop");
			clicks = view.getClickCount();
		}
		wc.playRound(ros);
		qf = new QuarterFinals(ros.winners);
		view.displayQf(qf);
		
		// play round and show next round once the button has been clicked in the view
		while (clicks < 2) {
			System.out.println("in second while loop");
			clicks = view.getClickCount();
		}
		wc.playRound(qf);
		sf = new SemiFinals(qf.winners);
		view.displaySf(sf);
		
		// play round and show next round once the button has been clicked in the view
		while (clicks < 3) {
			System.out.println("in third while loop");
			clicks = view.getClickCount();
		}
		wc.playRound(sf);
		finals = new Finals(sf.winners);
		view.displayFinals(finals);
		
		// play round and show next round once the button has been clicked in the view
		while (clicks < 4) {
			System.out.println("in fourth while loop");
			clicks = view.getClickCount();
		}
		wc.playRound(finals);
		view.displayWinner(finals);
		
	}
	
	


}