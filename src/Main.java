

public class Main {
	public static void main(String[] args) {
	
	WorldCup wc = new WorldCupModel();
	WorldCupView view = new WorldCupViewConsole();
	WorldCupController console = new WorldCupControllerConsole(wc, view);
	console.go();
	}
}