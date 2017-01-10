
public class King extends Chesspieces{
  private String currentLocation;
  private char player;
  public static void main (String[]args){
    King k = new King(0, 0, 'a');
    System.out.println(k);
  }
  public King(int x, int y, char p){
    currentLocation = Integer.toString(x) + Integer.toString(y);
    player = p;
  }

  public void move(String newlocation){
    if (isValid(newlocation)){
      currentLocation = locationtoInt(newlocation);
    }
  }

  public String toString(){
    return("K");
  }

  public boolean isValid(String newlocation){
    //horizontal:
    if (Math.abs(Integer.parseInt(locationtoInt(newlocation)) - Integer.parseInt(currentLocation)) == 1^
    Math.abs(Integer.parseInt(locationtoInt(newlocation)) - Integer.parseInt(currentLocation)) == 10^
    Math.abs(Integer.parseInt(locationtoInt(newlocation)) - Integer.parseInt(currentLocation)) == 11^
    Math.abs(Integer.parseInt(locationtoInt(newlocation)) - Integer.parseInt(currentLocation)) == 9){
      return true;
    }else{
      return false;
    }
  }
  public static String locationtoInt(String location){ //string bc "00" for a1
    String ret = "";
    String beg = location.substring(0,1);
    String end = location.substring(1);
    int endInt = Integer.parseInt(end);
    ret += Integer.toString(endInt-1);
    if (beg.equals("a")) ret += "0";
    if (beg.equals("b")) ret += "1";
    if (beg.equals("c")) ret += "2";
    if (beg.equals("d")) ret += "3";
    if (beg.equals("e")) ret += "4";
    if (beg.equals("f")) ret += "5";
    if (beg.equals("g")) ret += "6";
    if (beg.equals("h")) ret += "7";
    return ret;
  }

}
