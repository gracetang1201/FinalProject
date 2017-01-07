public class Knight extends Chesspieces{
    private char player;
    private int currentLocation;
    public Bishop(int x, int y, char p){
currentLocation = 10*x + y;
player = p;
    }
    public String toString(Bishop b){
return "N";
    }
    public void move(String newlocation){
if(isValid (newlocation)){
   currentLocation = locationtoInt(newlocation);
}
    }
    public boolean isValid(String newlocation){
if( abs( locationtoInt(newlocation) - currentLocation ) == 12 ||
            abs( locationtoInt(newlocation) - currentLocation ) == 21 ||
            abs( locationtoInt(newlocation) - currentLocation ) == 9 ||
   abs( locationtoInt(newlocation) - currentLocation ) == 8 ){
   return true;
}
    }
}
