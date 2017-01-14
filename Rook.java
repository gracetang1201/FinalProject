public class Rook extends Chesspieces{
  private String currentLocation;
  private char player;
  public Rook(int x, int y, char p){
    currentLocation = Integer.toString(y) + Integer.toString(x);
    player = p;
  }
  public String toString(){
    return "R";
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
  public boolean isValid(String newlocation){
    int newloc = Integer.parseInt(super.locationtoInt(newlocation));
    //int curloc = Integer.toString(currentLocation);
    int newTenth = newloc/10;
    int newFirst = newloc%10;
    int curTenth = Integer.parseInt(currentLocation.substring(0,1));
    int curFirst = Integer.parseInt(currentLocation.substring(1));
    if (Math.abs(newloc-curTenth*10+curFirst)%10 == 0||
	newTenth == curTenth){
      return true;
    }else{
      return false;
    }
  }
}
