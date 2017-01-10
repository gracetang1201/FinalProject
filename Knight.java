//import java.lang.Math;
public class Knight extends Chesspieces{
  private char player;
  private String currentLocation;
  public Knight(int x, int y, char p){
    currentLocation = Integer.toString(x) + Integer.toString(y);
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
    if( Math.abs(Integer.parseInt(super.locationtoInt(newlocation)) - Integer.parseInt(currentLocation)) == 12 ||
    Math.abs(Integer.parseInt(super.locationtoInt(newlocation)) - Integer.parseInt(currentLocation)) == 21 ||
    Math.abs(Integer.parseInt(super.locationtoInt(newlocation)) - Integer.parseInt(currentLocation)) == 9 ||
    Math.abs(Integer.parseInt(super.locationtoInt(newlocation)) - Integer.parseInt(currentLocation)) == 8 ){
      return true;
    }else{
      return false;
    }
  }
}
