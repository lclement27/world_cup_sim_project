
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * World Cup view implementation
 * @author lucasclement
 *
 */
public class WorldCupViewConsole extends JFrame implements WorldCupView {

	private static final long serialVersionUID = -206424862737940498L;
	final JFileChooser fc = new JFileChooser();
	private List<String> teamsFromFile;
	private List<Country> teams;
	private JPanel mainPanel;
	private boolean fileInput;
	private int clickCount;
	
	/**
	 * No argument constructor. Creates Pane for the GUI
	 */
	public WorldCupViewConsole() {
		fileInput = false;
		clickCount = 0;
		getContentPane().setLayout(null);
		JPanel panel_control = new JPanel();
		mainPanel = panel_control; // so cna be referenced at other locations in the class
		panel_control.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.setVisible(true);
		this.setTitle("World Cup");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void displayRos(Round ros) {
		// creates new labels for each team and displays them
		JLabel rosOneLabel = new JLabel(ros.matches.get(0).get(0).toString());
		rosOneLabel.setBounds(151, 6, 100, 16);
		getContentPane().add(rosOneLabel);
		
		JLabel rosTwoLabel = new JLabel(ros.matches.get(0).get(1).toString());
		rosTwoLabel.setBounds(151, 24, 100, 16);
		getContentPane().add(rosTwoLabel);
		
		JLabel rosThreeLabel = new JLabel(ros.matches.get(1).get(0).toString());
		rosThreeLabel.setBounds(151, 51, 100, 16);
		getContentPane().add(rosThreeLabel);
		
		JLabel rosFourLabel = new JLabel(ros.matches.get(1).get(1).toString());
		rosFourLabel.setBounds(151, 68, 100, 16);
		getContentPane().add(rosFourLabel);
		
		JLabel rosFiveLabel = new JLabel(ros.matches.get(2).get(0).toString());
		rosFiveLabel.setBounds(151, 96, 100, 16);
		getContentPane().add(rosFiveLabel);
		
		JLabel rosSixLabel = new JLabel(ros.matches.get(2).get(1).toString());
		rosSixLabel.setBounds(151, 115, 100, 16);
		getContentPane().add(rosSixLabel);
		
		JLabel rosSevenLabel = new JLabel(ros.matches.get(3).get(0).toString());
		rosSevenLabel.setBounds(151, 137, 100, 16);
		getContentPane().add(rosSevenLabel);
		
		JLabel rosEightLabel = new JLabel(ros.matches.get(3).get(1).toString());
		rosEightLabel.setBounds(151, 153, 100, 16);
		getContentPane().add(rosEightLabel);
		
		JLabel rosNineLabel = new JLabel(ros.matches.get(4).get(0).toString());
		rosNineLabel.setBounds(151, 176, 100, 16);
		getContentPane().add(rosNineLabel);
		
		JLabel rosTenLabel = new JLabel(ros.matches.get(4).get(1).toString());
		rosTenLabel.setBounds(151, 192, 100, 16);
		getContentPane().add(rosTenLabel);
		
		JLabel rosElevenLabel = new JLabel(ros.matches.get(5).get(0).toString());
		rosElevenLabel.setBounds(151, 221, 100, 16);
		getContentPane().add(rosElevenLabel);
		
		JLabel rosTwelveLabel = new JLabel(ros.matches.get(5).get(1).toString());
		rosTwelveLabel.setBounds(151, 237, 100, 16);
		getContentPane().add(rosTwelveLabel);
		
		JLabel rosThirteenLabel = new JLabel(ros.matches.get(6).get(0).toString());
		rosThirteenLabel.setBounds(151, 262, 100, 16);
		getContentPane().add(rosThirteenLabel);
		
		JLabel rosFourteenLabel = new JLabel(ros.matches.get(6).get(1).toString());
		rosFourteenLabel.setBounds(151, 276, 100, 16);
		getContentPane().add(rosFourteenLabel);
		
		JLabel rosSixteenLabel = new JLabel(ros.matches.get(7).get(1).toString());
		rosSixteenLabel.setBounds(151, 316, 100, 16);
		getContentPane().add(rosSixteenLabel);
		
		JLabel rosFifteenLabel = new JLabel(ros.matches.get(7).get(0).toString());
		rosFifteenLabel.setBounds(151, 300, 100, 16);
		getContentPane().add(rosFifteenLabel);
		
		// update the pane with the new information
		getContentPane().repaint();
	}
	
	@Override
	public void displayQf(Round qf) {
		// creates new labels for each team and displays them
		JLabel qfOneLabel = new JLabel(qf.matches.get(0).get(0).toString());
		qfOneLabel.setBounds(263, 19, 100, 16);
		getContentPane().add(qfOneLabel);
		
		JLabel qfTwoLabel = new JLabel(qf.matches.get(0).get(1).toString());
		qfTwoLabel.setBounds(263, 63, 100, 16);
		getContentPane().add(qfTwoLabel);
		
		JLabel qfThreeLabel = new JLabel(qf.matches.get(1).get(0).toString());
		qfThreeLabel.setBounds(263, 109, 100, 16);
		getContentPane().add(qfThreeLabel);
		
		JLabel qfFourLabel = new JLabel(qf.matches.get(1).get(1).toString());
		qfFourLabel.setBounds(263, 145, 100, 16);
		getContentPane().add(qfFourLabel);
		
		JLabel qfFiveLabel = new JLabel(qf.matches.get(2).get(0).toString());
		qfFiveLabel.setBounds(263, 184, 100, 16);
		getContentPane().add(qfFiveLabel);
		
		JLabel qfSixLabel = new JLabel(qf.matches.get(2).get(1).toString());
		qfSixLabel.setBounds(263, 230, 100, 16);
		getContentPane().add(qfSixLabel);
		
		JLabel qfSevenLabel = new JLabel(qf.matches.get(3).get(0).toString());
		qfSevenLabel.setBounds(263, 271, 100, 16);
		getContentPane().add(qfSevenLabel);
		
		JLabel qfEightLabel = new JLabel(qf.matches.get(3).get(1).toString());
		qfEightLabel.setBounds(263, 308, 100, 16);
		getContentPane().add(qfEightLabel);
		
		// update the pane with the new information
		getContentPane().repaint();
	}
	
	@Override
	public void displaySf(Round sf) {
		// creates new labels for each team and displays them
		JLabel sfOneLabel = new JLabel(sf.matches.get(0).get(0).toString());
		sfOneLabel.setBounds(366, 39, 100, 16);
		getContentPane().add(sfOneLabel);
		
		JLabel sfTwoLabel = new JLabel(sf.matches.get(0).get(1).toString());
		sfTwoLabel.setBounds(366, 126, 100, 16);
		getContentPane().add(sfTwoLabel);
		
		JLabel sfThreeLabel = new JLabel(sf.matches.get(1).get(0).toString());
		sfThreeLabel.setBounds(366, 207, 100, 16);
		getContentPane().add(sfThreeLabel);
		
		JLabel sfTFourLabel = new JLabel(sf.matches.get(1).get(1).toString());
		sfTFourLabel.setBounds(366, 287, 100, 16);
		getContentPane().add(sfTFourLabel);
		
		// update the pane with the new information
		getContentPane().repaint();
	}
	
	@Override
	public void displayFinals(Round finals) {
		// creates new labels for each team and displays them
		JLabel finalOneLabel = new JLabel(finals.matches.get(0).get(0).toString());
		finalOneLabel.setBounds(469, 84, 100, 16);
		getContentPane().add(finalOneLabel);
		
		JLabel finalTwoLabel = new JLabel(finals.matches.get(0).get(1).toString());
		finalTwoLabel.setBounds(469, 248, 100, 16);
		getContentPane().add(finalTwoLabel);
		
		// update the pane with the new information
		getContentPane().repaint();
	}
	
	@Override
	public void displayWinner(Round finals) { 
		// creates new label for the winner and displays them
		JLabel winnerLabel = new JLabel(finals.winners.get(0).toString());
		winnerLabel.setBounds(568, 165, 100, 16);
		getContentPane().add(winnerLabel);
		
		// update the pane with the new information
		getContentPane().repaint();
	}
	
	@Override
	public List<Country> getCountries(List<String> list) {
		// instantiate new ArrayList
		List<Country> countries = new ArrayList<Country>();
		// walk through all the entries in the list of Strings
		for(String entry : list ) {
			// split the string at every "." and put the results into a list
			String[] splitEntry = entry.split("[.]+");
			// first element should be the rank, so change to an Integer and store
			int rank = Integer.valueOf(splitEntry[0]);
			// trim the white space from the beginning of the string and store
			String name = splitEntry[1].trim();
			// create new Country object with information
			Country newCountry = new Country(name, rank);
			// add to new list
			countries.add(newCountry);
			
		}
		return countries;
	}
	
	@Override
	public void createInputButton() {
		// create input button
		JButton inputButton = new JButton("Input teams");
		// add listener to respond to any clicks of the button
		inputButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// opens finder
				int returnVal = fc.showOpenDialog(mainPanel);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// stores selected file
					File inFile = fc.getSelectedFile();
					// gets the path of the file selected
					Path filePath = Paths.get(inFile.toString());
					// instantiate and change within try block
					List<String> fileOutput = null;
					try {
						// read lines of the file and store
						fileOutput = Files.readAllLines(filePath);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					// store into class variable to be accessed elsewhere
					teamsFromFile = fileOutput;
					// call helper functions to turn country strings into Country objects
					teams = getCountries(teamsFromFile);
					// we have a file input, so variable becomes true
					fileInput = true;
				}
			}
		});
		inputButton.setBounds(6, 19, 117, 29);
		getContentPane().add(inputButton);
		
	}
	
	@Override
	public void createPlayButton() {
		// create play button
		JButton playButton = new JButton("Play Next Round");
		// add listener to respond to any clicks of the button
		playButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// increment click counter, to be used in Controller
				clickCount += 1;
			}
		});
		
		
		playButton.setBounds(6, 63, 131, 29);
		getContentPane().add(playButton);
	}
	
	@Override
	public boolean fileTaken() {
		return this.fileInput;
	}
	
	@Override
	public List<Country> getTeams() {
		return this.teams;
	}
	
	@Override
	public int getClickCount() {
		return clickCount;
	}

}