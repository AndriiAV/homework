package game;

public class Model {
	public int minRand = 0;
	public int maxRand = 100;
	private int gameNumber;
    public int userNumber;
	
	public int random (int minRand, int maxRand) {
		return minRand + (int) (Math.random() * maxRand);
		}
	
    public int random () {
    	return (int) (Math.random() * 100);
    	}

    public boolean giveAnswer (int userNumber, int gameNumber) {
        if (userNumber == gameNumber) return true;
        else return false;
    }
    
    public String comparing (int userNumber, int gameNumber) {
        if (userNumber < gameNumber) return "Game number higher";
        else if (userNumber > gameNumber) return "Game number less";
        else return "Congratulations! You are winner!";
    }

	public int getGameNumber() {
		return gameNumber;
	}

	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}
}
