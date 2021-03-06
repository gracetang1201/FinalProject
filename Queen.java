
public class Queen extends Chesspieces{
  private char player;
  private String currentLocation;
  public Queen(int x, int y, char p){
    currentLocation = Integer.toString(y) + Integer.toString(x);
    player = p;
  }
  public String toString (){
    return "Q";
  }

  public String getPlayer(){
    return Character.toString(player);
  }

  public boolean move(String newlocation){
    if(isValid (newlocation)){
      currentLocation = locationtoInt(newlocation);
      return true;
    }else{
	return false;
    }
  }
  public boolean isValid (String newlocation){
    int newl = Integer.parseInt(super.locationtoInt(newlocation));
    int curl = Integer.parseInt(currentLocation);
    if (Math.abs(newl - curl)%11 == 0^
	Math.abs(newl - curl)%9 == 0^
	newl/10 == curl/10^
	newl%10 == curl%10){
      return true;
    }else{
      return false;
    }

  }
}
