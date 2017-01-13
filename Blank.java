import java.lang.UnsupportedOperationException;

public class Blank extends Chesspieces{
  private String currentLocation;
    private char player;

    public Blank(int x, int y){
    currentLocation = Integer.toString(y) + Integer.toString(x);
    player = 'n';
  }

  public String getPlayer(){
    return Character.toString(player);
  }

  public boolean move(String newlocation){
    return false;
  }
  public boolean isValid(String newlocation){
    throw new UnsupportedOperationException();
  }
  public String toString(){
    return ".";
  }
}
