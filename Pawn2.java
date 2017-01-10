public class Pawn2 extends Chesspieces2{
  private char player;
  private int currentLocation;
  public Pawn2(int x, int y, char p){
    currentLocation = 10*x + y;
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
 	int newloc = super.locationtoInt(newlocation);
 	if (currentLocation + 1 == newloc){
 	    return true;
 	}
 	if (currentLocation + 2 == newloc){
 	    return true;
 	}
 	if (currentLocation + 11 == newloc){ // not valid if nothing in newloc
 	    return true;
 	}
 	if (currentLocation + 9 == newloc){ // not valid if nothing in new loc
 	    return true;
 	}
   else{
     return false;
   }
     }
}