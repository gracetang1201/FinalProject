public class Rook extends Chesspieces{
    private int currentLocation;
    private char player;
    public Rook(int x, int y, char p){
	currentLocation = 10*x + y;
	player = p;
    }
    public string toString(Rook r){
	return "R";
    }
    public void move(String newlocation){
	if(isValid (newlocation)){
	    currentLocation = locationtoInt(newlocation);
	}
    }
    public boolean isValid(String newlocation){
	int newloc = locationtoInt(newlocation);
	String curloc = Integer.toString(currentlocation);
        int newTenth = newloc/10;
	int newFirst = newloc%10;
	int curTenth = currentLocation/10;
	int curFirst = currentLocation%10;
	if (newTenth==curTenth ^ newFirst==curFirst){
	    return true;
	}
    }
}
