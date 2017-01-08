
public class Queen extends Chesspieces{
    private char player;
    private int currentLocation;
    public Queen(int x, int y, char p){
	currentLocation = 10*x + y;
	player = p;
    }
    public String toString (Queen q){
	return "Q";
    }
    public void move(String newlocation){
	if(isValid (newlocation)){
	    currentLocation = locationtoInt(newlocation);
	}
    }
    public boolean isValid (String newlocation){
	if (Math.abs(super.locationtoInt(newlocation) - currentLocation)%11 == 0^
	    Math.abs(super.locationtoInt(newlocation) - currentLocation)%9 == 0^
	    super.locationtoInt(newlocation)/10 == currentLocation/10^
	    super.locationtoInt(newlocation)%10 == currentLocation%10){
	    return true;
	}else{
	    return false;
	}

    }
}
