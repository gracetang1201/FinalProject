public class Chessboard{

  public static void main (String[]args){
    Chessboard n = new Chessboard();
    System.out.println(n);
  }
  private Chesspieces[][]cb;
  public Chessboard(){
    cb = new Chesspieces[8][8];
    for (int c = 0; c < 9; c++){
      for (int r = 0; r < 9; r++){
        cb[r][c] = new Blank(r,c); //!
      }
    }
  }
  public String toString(){
    String ans = "";
    for (int r = 0; r < cb.length; r++){
      for (int c = 0; c < cb[r].length; c++){
        if (c == cb[r].length - 1){
          ans = ans + cb[r][c] + "\n" ;
        }else{
          ans = ans + cb[r][c] + " ";
        }
      }
    }
    return ans;
  }

  public void fillInPieces(){
    //Pawns
    for (int insertPawn = 0; insertPawn < 9; insertPawn++){
      Pawn wp1 = new Pawn(insertPawn, 1, 'a');
    }
    //King
  }


  /*
  for (int r = 0; r < 8; r++){
  for (int c = 0; c < 8; c++){

  if (r == 6 || r == 1){
  cb[r][c] = new Pawn();

}else{
if (r == 7 || r == 0){

switch(c){
case 0: cb[r][c] = 'R';
break;
case 1: cb[r][c] = 'N';
break;
case 2:cb[r][c]  = 'B';
break;
case 3:cb[r][c] = 'Q';
break;
case 4: cb[r][c] = 'K';
break;
case 5:cb[r][c] = 'B';
break;
case 6:cb[r][c] = 'N';
break;
case 7: cb[r][c] = 'R';
break;
}

}else{
cb[r][c] = '.';
}}

}}}
*/


// public String toString(){
// String ans = "";
// for (int r = 0; r < 8; r++){
//     for(int c = 0; c < 8; c++){
//     if (c == cb[r].length - 1){
//         ans = ans + cb[r][c] + "\n" ;
//     }else{
//         ans = ans + cb[r][c] + " ";
//     }
//     }
// }
// return ans;
// }

public void set(Chesspieces x, String newlocation){
  cb[locationtoInt(newlocation)/10][locationtoInt(newlocation)%10] = x;
}
public Chesspieces get(String location){
  return cb[locationtoInt(location)/10][locationtoInt(location)%10];
}
public static int locationtoInt(String location){
  int ret = 0;
  switch(location.substring(0,1)){
    case "a": ret =  10 + Integer.parseInt(location.substring(1));
    case "b": ret =  20 + Integer.parseInt(location.substring(1));
    case "c": ret =  30 + Integer.parseInt(location.substring(1));
    case "d": ret =  40 + Integer.parseInt(location.substring(1));
    case "e": ret =  50 + Integer.parseInt(location.substring(1));
    case "f": ret =  60 + Integer.parseInt(location.substring(1));
    case "g": ret =  70 + Integer.parseInt(location.substring(1));
    case "h": ret =  80 + Integer.parseInt(location.substring(1));
    default: break;
  }
  return ret;
}
}
