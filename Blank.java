import java.lang.UnsupportedOperationException;

public class Blank extends Chesspieces{
  private int currentLocation;

  public Blank(int x, int y){
    currentLocation = 10*x + y;
  }
  public void move(String newlocation){
    throw new UnsupportedOperationException();
  }
  public boolean isValid(String newlocation){
    throw new UnsupportedOperationException();
  }
  public String toString(Blank bl){
    return ".";
  }
}
