public class King extends Chesspieces{
    
    public void move(String newlocation){
	if (isValid(newlocation)){
	    currentLocation = locationtoInt(newlocation);
     	}
	
    }

}
