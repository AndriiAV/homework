package game;

public class View {
	public static final String INPUT_DATA = "Make a guess number: ";
    public static final String WRONG_DATA = "Incorrect data! Please, input the number!";
    public static final String OUT_DATA = "Data out of the range! Repeat, please.";
    
    public void printMessage (String message) {
        System.out.println(message);
    }
    public void printTask (int minRand, int maxRand) {
        System.out.println("new range = from "+minRand + " to " + maxRand);
    }
}