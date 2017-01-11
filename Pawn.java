public class Pawn extends Chesspieces{
  private char player;
  private String currentLocation;
  public Pawn(int x, int y, char p){
    currentLocation = Integer.toString(y) + Integer.toString(x);
    player = p;
  }
  public String toString(){
    return "P";
  }

  public void move(String newlocation){
    if(isValid(newlocation)){
      currentLocation = locationtoInt(newlocation);
    }
  }
  public boolean isValid(String newlocation){
    int newloc = Integer.parseInt(super.locationtoInt(newlocation));
    int curren = Integer.parseInt(currentLocation);
    if (newloc-curren == 10){
      return true;
    }
    if (curren + 20 == newloc){
      return true;
    }
    if (curren + 11 == newloc){ // not valid if nothing in newloc
      return true;
    }
    if (curren + 9 == newloc){ // not valid if nothing in new loc
      return true;
    }
    else{
      System.out.println(currentLocation);
      System.out.println("hi");
      return false;
    }
  }
}
