public class Pawn extends Chesspieces{
    private int currentLocation;
    public Pawn(int x, int y){
    currentLocation    = 10*x + y;
    }
    public String toString(Pawn p){
    return "P";
    }
    Chessboard chessb = new Chessboard();
    public void move(String newlocation){
    if(isValid newlocation){
        currentLocation = locationtoInt(newlocation);
    }
    }
    public boolean isValid(String newlocation){
    int newloc = locationtoInt(newlocation);
    if (currentLocation + 10 == newloc&&
        chessb[newloc/10][newloc%10] == '.'){
        return true;
    }
    }
}
