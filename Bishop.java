public class Bishop extends Chesspieces{
  private char player;
  private String currentLocation;
  public Bishop(int x, int y, char p){
    currentLocation = Integer.toString(x) + Integer.toString(y);
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
    if (Math.abs(Integer.parseInt(super.locationtoInt(newlocation)) - Integer.parseInt(currentLocation))%11 == 0||
    Math.abs(Integer.parseInt(super.locationtoInt(newlocation)) - Integer.parseInt(currentLocation))%9 == 0){
      return true;
    }else{
      return false;
    }
  }
}
