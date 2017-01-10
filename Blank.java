import java.lang.UnsupportedOperationException;

public class Blank extends Chesspieces{
  private String currentLocation;

  public Blank(int x, int y){
    currentLocation = Integer.toString(x) + Integer.toString(y);
  }
  public void move(String newlocation){
    throw new UnsupportedOperationException();
  }
  public boolean isValid(String newlocation){
    throw new UnsupportedOperationException();
  }
  public String toString(){
    return ".";
  }
}
