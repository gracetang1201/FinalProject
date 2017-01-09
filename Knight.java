//import java.lang.Math;
public class Knight extends Chesspieces{
    private char player;
    private int currentLocation;
    public Knight(int x, int y, char p){
	currentLocation = 10*x + y;
	player = p;
    }
    public String toString(){
	return "N";
    }
    public void move(String newlocation){
	if(isValid (newlocation)){
	    currentLocation = locationtoInt(newlocation);
	}
    }
    public boolean isValid(String newlocation){
	if( Math.abs( super.locationtoInt(newlocation) - currentLocation ) == 12 ||
            Math.abs( super.locationtoInt(newlocation) - currentLocation ) == 21 ||
            Math.abs( super.locationtoInt(newlocation) - currentLocation ) == 9 ||
	    Math.abs( super.locationtoInt(newlocation) - currentLocation ) == 8 ){
	    return true;
	}else{
	    return false;
	}
    }
}
