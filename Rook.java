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
	if(locationtoInt(newlocation) - 
    }
}
