//import java.lang.Math;
public class Knight extends Chesspieces{
  private char player;
  private String currentLocation;
  public Knight(int x, int y, char p){
    currentLocation = Integer.toString(y) + Integer.toString(x);
    player = p;
  }
  public String toString(){
    return "N";
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
      int newl = Integer.parseInt(super.locationtoInt(newlocation));
      int curl = Integer.parseInt(currentLocation);
    if( Math.abs(newl - curl) == 12 ||
	Math.abs(newl - curl) == 21 ||
	Math.abs(newl - curl) == 9 ||
	Math.abs(newl - curl) == 8 ){
      return true;
    }else{
      return false;
    }
  }
}
