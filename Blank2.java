import java.lang.UnsupportedOperationException;

public class Blank2 extends Chesspieces2{
  private int currentLocation;

  public Blank2(int x, int y){
    currentLocation = 10*x + y;
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
