public abstract class Chesspieces2{
    public char player;

  //example: a3 --> substring/parseInt into 'a' and 3 --> change into 13
  public int currentLocation;

  //moves piece @ current to newlocation: use substring to analyze locations
  //maybe use a switch case to figure out what'a-e' represent in terms of
  //2d array
  //the first thing move is going to do is change newlocation to int
  abstract void move(String newlocation);

  abstract boolean isValid(String newlocation);


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
