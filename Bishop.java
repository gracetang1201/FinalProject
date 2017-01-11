public class Bishop extends Chesspieces{
  private char player;
  private String currentLocation;
  public Bishop(int x, int y, char p){
    currentLocation = Integer.toString(y) + Integer.toString(x);
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
      int newl = Integer.parseInt(super.locationtoInt(newlocation));
      int curl = Integer.parseInt(currentLocation);
    if (Math.abs(newl - curl)%11 == 0 || Math.abs(newl - curl)%9 == 0){
      return true;
    }else{
      return false;
    }
  }
}
