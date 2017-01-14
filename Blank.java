import java.lang.UnsupportedOperationException;

public class Blank extends Chesspieces{
  private String currentLocation;
    private char player;

  /**
   * Class constructor specifying location
   */
    public Blank(int x, int y){
    currentLocation = Integer.toString(y) + Integer.toString(x);
    player = 'n';
  }

/**
 * Gets private player variable
 * @return which user this chesspiece belongs to
 */
  public String getPlayer(){
    return Character.toString(player);
  }

/**
 * @return false because blanks cannot be moved
 */
  public boolean move(String newlocation){
    return false;
  }
  public boolean isValid(String newlocation){
    throw new UnsupportedOperationException();
  }

  /**
   * Gets string representation of piece
   * @return the string "."
   */
  public String toString(){
    return ".";
  }
}
