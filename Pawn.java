public class Pawn extends Chesspieces{
    private char player;
    private int currentLocation;
    public Pawn(int x, int y, char p){
	currentLocation = 10*x + y;
	player = p;
    }
    public String toString(Pawn p){
	return "P";
    }

    public void move(String newlocation){
	if(isValid(newlocation)){
	    currentLocation = locationtoInt(newlocation);
	}
    }
    public boolean isValid(String newlocation){
	int newloc = locationtoInt(newlocation);
	if (currentLocation + 1 == newloc){
	    return true;
	}
	if (currentLocation + 2 == newloc){
	    return true;
	}
	if (currentLocation + 11 == newloc){ // not valid if nothing in newloc
	    return true;
	}
	if (currentLocation + 9 == newloc){ // not valid if nothing in new loc
	    return true;
	}
  else{
    return false;
  }
    }
}
