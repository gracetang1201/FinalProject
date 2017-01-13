public abstract class Chesspieces{
    public char player;

  //example: a3 --> substring/parseInt into 'a' and 3 --> change into 13
  public String currentLocation;

  //moves piece @ current to newlocation: use substring to analyze locations
  //maybe use a switch case to figure out what'a-e' represent in terms of
  //2d array
  //the first thing move is going to do is change newlocation to int

  abstract String getPlayer();

  abstract boolean move(String newlocation);

  abstract boolean isValid(String newlocation);


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
