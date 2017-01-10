public class Bishop2 extends Chesspieces2{
  private char player;
  private int currentLocation;
  public Bishop2(int x, int y, char p){
    currentLocation = 10*x + y;
    player = p;
  }
  public String toString(){
    return "B";
  }
  public void move(String newlocation){
    if(isValid (newlocation)){
      currentLocation = locationtoInt(newlocation);
    }
  }
  public boolean isValid(String newlocation){
if (Math.abs(super.locationtoInt(newlocation) - currentLocation)%11 == 0||
 Math.abs(super.locationtoInt(newlocation) - currentLocation)%9 == 0){
      return true;
    }else{
      return false;
    }
  }
}
