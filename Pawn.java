public class Pawn extends Chesspieces{
    public Pawn(){
	
    }
    Chessboard chessb = new Chessboard();
    public void move(String newlocation){
	currentLocation = locationtoInt(newlocation);
    }
    public boolean isValid(String newlocation){
	int newloc = locationtoInt(newlocation);
	if (currentLocation + 10 == newloc&&
	    chessb[newloc/10][newloc%10] == '.'){
	    return true;
	}
    }
}
