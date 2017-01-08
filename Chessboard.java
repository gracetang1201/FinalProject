public class Chessboard{

  public static void main (String[]args){
    Chessboard n = new Chessboard();
    fillInPiecesStart(n);
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

  public static void fillInPiecesStart(Chessboard c){
    //Pawns for PlayerA
    for (int insertPawn = 0; insertPawn < 8; insertPawn++){
      Pawn wp1 = new Pawn(insertPawn, 1, 'a');
      cb[1][insertPawn] = wp1;
    }
    //Pawns for PlayerB
    for (int insertPawn = 0; insertPawn < 8; insertPawn++){
    Pawn wp1 = new Pawn(insertPawn, 6, 'b');
    cb[1][insertPawn] = wp1;
    }
    //Rooks for PlayerA
    Rook rka = new Rook(0, 0, 'a');
    cb[0][0] = rka;
    Rook rka1 = new Rook(0, 7, 'a');
    cb[0][7] = rka1;
    //Rooks for PlayerB
    Rook rkb = new Rook (7, 0, 'b');
    cb[7][0] = rkb;
    Rook rkb1 = new Rook(7, 7, 'b');
    cb[7][7] = rkb1;
    //Knight for PlayerA
    Knight kna = new Knight(0, 1, 'a');
    cb[0][1] = kna;
    Knight kna1 = new Knight(0, 6, 'a');
    cb[0][6] = kna1;
    //Knights for PlayerB
    Knight knb = new Knight(7, 1, 'b');
    cb[7][1] = knb;
    Knight knb1 = new Knight(7, 6, 'b');
    cb[7][6] = knb1;
    //Bishops for PlayerA
    Bishop bia = new Bishop(0, 2, 'a');
    cb[0][2] = bia;
    Bishop bia1 = new Bishop(0, 5, 'a');
    cb[0][5] = bia1;
    //Bishops for PlayerB
    Bishop bib = new Bishop(7, 5, 'b');
    cb[7][5] = bib;
    Bishop bib1 = new Bishop(7, 2, 'b');
    cb[7][2] = bib1;
    //Queen for PlayerA
    Queen qa = new Queen(0, 3, 'a');
    cb[0][3] = qa;
    //Queen for PlayerB
    Queen qb = new Queen(7, 4, 'b');
    cb[7][4] = qb;
    //King for PlayerA
    King ka = new King(0, 4, 'a');
    cb[0][4] = ka;
    //King for PlayerB
    King kb = new King(7, 3, 'b');
    cb[7][3] = kb;
  }



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
