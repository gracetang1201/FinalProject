public class Rook2 extends Chesspieces2{
  private int currentLocation;
  private char player;
  public Rook2(int x, int y, char p){
    currentLocation = 10*x + y;
    player = p;
  }
  public String toString(){
    return "R";
  }
  public void move(String newlocation){
    if(isValid (newlocation)){
      currentLocation = locationtoInt(newlocation);
    }
  }
  public boolean isValid(String newlocation){
 	int newloc = super.locationtoInt(newlocation);
 	String curloc = Integer.toString(currentLocation);
         int newTenth = newloc/10;
 	int newFirst = newloc%10;
 	int curTenth = currentLocation/10;
 	int curFirst = currentLocation%10;
 	if (newTenth==curTenth ^ newFirst==curFirst){
 	    return true;
 	}else{
 	    return false;
 	}
     }
}
