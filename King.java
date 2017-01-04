import java.lang.Math.*;
public class King extends Chesspieces{
    private int currentLocation;
    public King(int x, int y){
currentLocation = 10*x + y;
    }

    public void move(String newlocation){
if (isValid(newlocation)){
   currentLocation = locationtoInt(newlocation);
      }
    }

    public boolean isValid(String newlocation){
//horizontal:
if (abs(locationtoInt(newlocation) - currentLocation) == 1){
   return true;
}
//vertical:
if (abs(locationtoInt(newlocation) - currentLocation) == 10){
   return true;
}
//SE
if (abs(locationtoInt(newlocation) - currentLocation) == 11){
   return true;
}
//SW
if (abs(locationtoInt(newlocation) - currentLocation) == 9){
   return true;
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
