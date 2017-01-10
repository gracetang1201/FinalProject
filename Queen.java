
public class Queen extends Chesspieces{
  private char player;
  private String currentLocation;
  public Queen(int x, int y, char p){
    currentLocation = Integer.toString(x) + Integer.toString(y);
    player = p;
  }
  public String toString (){
    return "Q";
  }
  public void move(String newlocation){
    if(isValid (newlocation)){
      currentLocation = locationtoInt(newlocation);
    }
  }
  public boolean isValid (String newlocation){
    int newl = Integer.parseInt(super.locationtoInt(newlocation));
    if (Math.abs(newl - Integer.parseInt(currentLocation))%11 == 0^
    Math.abs(newl - Integer.parseInt(currentLocation))%9 == 0^
    newl/10 == Integer.parseInt(currentLocation)/10^
    newl%10 == Integer.parseInt(currentLocation)%10){
      return true;
    }else{
      return false;
    }

  }
}
