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
    if (newlocation == currentLocation + 1){
        return true;
    }
    //vertical:
    if (newlocation == currentLocation + 10){
        return true;
    }
    //SE
    if (newlocation == currentLocation + 11){
        return true;
    }
    //SW
    if (newlocation
    }

}
