public class Bishop extends Chesspieces{
    private char player;
    private int currentLocation;
    public Bishop(int x, int y, char p){
	currentLocation = 10*x + y;
	player = p;
    }
    public String toString(){
	return "B";
    }
    public void move(String newlocation){
	if(isValid (newlocation)){
	    currentLocation = locationtoInt(newlocation);
	}
    }
    public boolean isValid(String newlocation){
	if (Math.abs(super.locationtoInt(newlocation) - currentLocation)%11 == 0||
	    Math.abs(super.locationtoInt(newlocation) - currentLocation)%9 == 0){
	    return true;
	}else{
	    return false;
	}
    }
}
