public class Bishop extends Chesspieces{
    private char player;
    private int currentLocation;
    public Bishop(int x, int y, char p){
currentLocation = 10*x + y;
player = p;
    }
    public String toString(Pawn p){
return "B";
    }
    public void move(String newlocation){
if(isValid (newlocation)){

}
}
