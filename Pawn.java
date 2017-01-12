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

  public boolean  move(String newlocation){
    if(isValid(newlocation)){
      currentLocation = locationtoInt(newlocation);
      return true;
    }else{
	return false;
    }
  }
  public boolean isValid(String newlocation){
    int newloc = Integer.parseInt(super.locationtoInt(newlocation));
    int curren = Integer.parseInt(currentLocation);
    if ((Character.toString(player)).equals("a")){
	if (newloc-curren == 10){
	    return true;
	}
    }else{
	if (newloc-curren == -10){
	    return true;
	}	
    }
    if ((Character.toString(player)).equals("a")){
	if (newloc-curren == 20){
	    return true;
	}
    }else{
	if (newloc-curren == -20){
	    return true;
	}
    }
    if (curren + 11 == newloc){ // not valid if nothing in newloc !!!!!!!!!
      return true;
    }
    if (curren + 9 == newloc){ // not valid if nothing in new loc
      return true;
    }
    else{
      System.out.println(currentLocation);
      System.out.println(newlocation);
      System.out.println(super.locationtoInt(newlocation));
      System.out.println("hi");
      return false;
    }
  }
}
