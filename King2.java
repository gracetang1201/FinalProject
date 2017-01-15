public class King2 extends Chesspieces2{
  private int currentLocation;
  private char player;
  public static void main (String[]args){
    King2 k = new King2(0, 0, 'a');
    System.out.println(k);
  }
  public King2(int x, int y, char p){
    currentLocation = 10*x + y;
    player = p;
  }

  public void move(String newlocation){
    if (isValid(newlocation)){
      currentLocation = locationtoInt(newlocation);
    }
  }

  public String toString(){
    return("K");
  }

  public boolean isValid(String newlocation){
 	//horizontal:
 	if (Math.abs(locationtoInt(newlocation) - currentLocation) == 1^
 	    Math.abs(locationtoInt(newlocation) - currentLocation) == 10^
 	    Math.abs(locationtoInt(newlocation) - currentLocation) == 11^
 	    Math.abs(locationtoInt(newlocation) - currentLocation) == 9){
 	    return true;
 	}else{
 	    return false;
 	}
     }
     public static int locationtoInt(String location){
 	int ret = 0;
 	switch(location.substring(0,1)){
 	case "a": ret =  10 + Integer.parseInt(location.substring(1));
 	case "b": ret =  20 + Integer.parseInt(location.substring(1));
 	case "c": ret =  30 + Integer.parseInt(location.substring(1));
 	case "d": ret =  40 + Integer.parseInt(location.substring(1));
 	case "e": ret =  50 + Integer.parseInt(location.substring(1));
 	case "f": ret =  60 + Integer.parseInt(location.substring(1));
 	case "g": ret =  70 + Integer.parseInt(location.substring(1));
 	case "h": ret =  80 + Integer.parseInt(location.substring(1));
 	default: break;
 	}
 	return ret;
     }

}
