public class Bishop extends Chesspieces{
  private char player;
  private String currentLocation;

/**
 * Class constructor specifying location and whose user it belongs to.
 */
  public Bishop(int x, int y, char p){
    currentLocation = Integer.toString(y) + Integer.toString(x);
    player = p;
  }

/**
 * Returns letter representation
 * @return the letter "B"
 */
  public String toString(){
    return "B";
  }

/**
 * Gets the private player variable
 * @return which player this chesspiece belongs to
 */
  public String getPlayer(){
    return Character.toString(player);
  }

/**
 * Works in conjunction with isValid() to determine if move is valid
 * @return if move is valid
 */
  public boolean move(String newlocation){
    if(isValid (newlocation)){
      currentLocation = locationtoInt(newlocation);
      return true;
    }else{
	return false;
    }
  }

/**
 * Holds the chess rules for the Bishop piece
 * @return if move would ve valid
 */
  public boolean isValid(String newlocation){
      int newl = Integer.parseInt(super.locationtoInt(newlocation));
      int curl = Integer.parseInt(currentLocation);
    if (Math.abs(newl - curl)%11 == 0 || Math.abs(newl - curl)%9 == 0){
      return true;
    }else{
      return false;
    }
  }
}
