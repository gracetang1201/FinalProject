import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;;


public class Chessboard{
  //instance variables:
  private boolean KingAlive;
  private int counter;
  private Chesspieces[][]cb;

  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";


  public static void main(String[]args){
    Scanner user_input = new Scanner(System.in);
    Chessboard c = new Chessboard();
    System.out.println(c); // prints chessboard
    while (c.KingAlive){
      while (c.counter%2!=0){
        String wturn;
        System.out.println("Player 1 turn: ");
        wturn = user_input.nextLine();
        if (doAction(wturn,c.cb,c)){
          c.counter += 1;
          System.out.println(c);
        }
      }
      while (c.counter%2==0){
        String bturn;
        System.out.println("Player 2 turn: ");
        bturn = user_input.nextLine();
        if (doAction(bturn,c.cb,c)){
          c.counter += 1;
          System.out.println(c);
        }
      }
    }
  }

  public Chessboard(){
    KingAlive = true;
    promotion = false;
    counter = 1;
    cb = new Chesspieces[8][8];
    for (int c = 0; c < 8; c++){
      for (int r = 0; r < 8; r++){
        cb[r][c] = new Blank(r, c);
      }
    }
    fillInPiecesStart();
  }

  public String toString(){
  String ans = "";
  for (int r = 0; r < cb.length; r++){
  for (int c = 0; c < cb[r].length; c++){
  if (c == cb[r].length - 1){
  if (cb[r][c].getPlayer().equals("a")){
  ans += ANSI_BLUE;
}
if (cb[r][c].getPlayer().equals("b")){
ans += ANSI_RED;
}
ans += cb[r][c].toString() + ANSI_RESET + "\n";
}else{
if (cb[r][c].getPlayer().equals("a")){
ans += ANSI_BLUE;
}
if (cb[r][c].getPlayer().equals("b")){
ans += ANSI_RED;
}
ans = ans + cb[r][c].toString() + ANSI_RESET + " ";
}
}

}
return ans;
}

// public String toString(){
//   String ans = "";
//   for (int r = 0; r < cb.length; r++){
//     for (int c = 0; c < cb[r].length; c++){
//       if (c == cb[r].length - 1){
//         ans = ans + cb[r][c].toString() + "\n" ;
//       }else{
//         ans = ans + cb[r][c].toString() + " ";
//       }
//     }
//   }
//   return ans;
// }

/**
* Returns a String object in the form of two ints, determining exact location in array.
*
* @param location location in array in the form of a letter and number
*/
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

/**
* Returns a String object in the form of a letter and number, determining exact location in array.
*
* @param location location in array in the form of two ints
*/
public static String inttoLocation(String location){
  String ret = "";
  String beg = location.substring(0,1);
  String end = location.substring(1);
  int endInt = Integer.parseInt(end);
  if (beg.equals("0")) ret += "a";
  if (beg.equals("1")) ret += "b";
  if (beg.equals("2")) ret += "c";
  if (beg.equals("3")) ret += "d";
  if (beg.equals("4")) ret += "e";
  if (beg.equals("5")) ret += "f";
  if (beg.equals("6")) ret += "g";
  if (beg.equals("7")) ret += "h";
  ret += Integer.toString(endInt+1);
  return ret;
}


private void set(Chesspieces c, int x, int y){
  cb[x][y] = c;
  c.currentLocation = Integer.toString(x) + Integer.toString(y);
}
public void fillInPiecesStart(){
  for (int insertPawn = 0; insertPawn < 8; insertPawn++){
    Pawn wp1 = new Pawn(insertPawn, 1, 'a');
    cb[1][insertPawn] = wp1;
  }
  //Pawns for PlayerB
  for (int insertPawn = 0; insertPawn < 8; insertPawn++){
    Pawn wp1 = new Pawn(insertPawn, 6, 'b');
    //cb[1][insertPawn] = wp1;
    set(wp1, 6, insertPawn);
  }
  //Rooks for PlayerA
  Rook rka = new Rook(0, 0, 'a');
  //cb[0][0] = rka;
  set(rka, 0, 0);
  Rook rka1 = new Rook(0, 7, 'a');
  //cb[0][7] = rka1;
  set(rka1, 0, 7);
  //Rooks for PlayerB
  Rook rkb = new Rook (7, 0, 'b');
  //cb[7][0] = rkb;
  set(rkb, 7, 0);
  Rook rkb1 = new Rook(7, 7, 'b');
  //cb[7][7] = rkb1;
  set(rkb1, 7, 7);
  //Knight for PlayerA
  Knight kna = new Knight(0, 1, 'a');
  //cb[0][1] = kna;
  set(kna, 0, 1);
  Knight kna1 = new Knight(0, 6, 'a');
  //cb[0][6] = kna1;
  set(kna1, 0, 6);
  //Knights for PlayerB
  Knight knb = new Knight(7, 1, 'b');
  //cb[7][1] = knb;
  set(knb, 7, 1);
  Knight knb1 = new Knight(7, 6, 'b');
  //cb[7][6] = knb1;
  set(knb1, 7, 6);
  //Bishops for PlayerA
  Bishop bia = new Bishop(0, 2, 'a');
  //cb[0][2] = bia;
  set(bia, 0, 2);
  Bishop bia1 = new Bishop(0, 5, 'a');
  //cb[0][5] = bia1;
  set(bia1, 0, 5);
  //Bishops for PlayerB
  Bishop bib = new Bishop(7, 5, 'b');
  //cb[7][5] = bib;
  set(bib, 7, 5);
  Bishop bib1 = new Bishop(7, 2, 'b');
  //cb[7][2] = bib1;
  set(bib1, 7, 2);
  //Queen for PlayerA
  Queen qa = new Queen(0, 3, 'a');
  //cb[0][3] = qa;
  set(qa, 0, 3);
  //Queen for PlayerB
  Queen qb = new Queen(7, 4, 'b');
  //cb[7][4] = qb;
  set(qb, 7, 4);
  //King for PlayerA
  King ka = new King(0, 4, 'a');
  //cb[0][4] = ka;
  set(ka, 0, 4);
  //King for PlayerB
  King kb = new King(7, 3, 'b');
  //cb[7][3] = kb;
  set(kb, 7, 3);
}

/**
* Does specified action of moving chesspieces called by user
*
* @param string input taken by Scanner that determines where the user wants to move a chesspiece from and to.
* @param chb the current instance of chesspieces array
* @param c the current instance of chessboard
*/
public static boolean doAction(String string,Chesspieces[][] chb, Chessboard c){
  String[] splitted = string.split("\\s+");
  int curl = 0;
  int curlL = 0;
  int curlR = 0;
  int newl = 0;
  int newlL = 0;
  int newlR = 0;
  Chesspieces piece;

  // if user types in "quit" in input, game quits
  if (string.equals("quit")){
    System.exit(0);
  }

  // tries to catch invalid user inputs
  try{
    curl = Integer.parseInt(locationtoInt(splitted[0]));
    curlL = curl/10;
    curlR = curl%10;
    newl = Integer.parseInt(locationtoInt(splitted[1]));
    newlL = newl/10;
    newlR = newl%10;

  } catch (StringIndexOutOfBoundsException e){
    System.out.println("<current location> <new location>");
    return false;
  } catch (NumberFormatException e){
    System.out.println("<current location> <new location>");
    return false;
  }

  try{

    // user input is invalid
    if (splitted.length != 2){
      System.out.println("<current location> <new location>");
      return false;
    }

    // cannot move other's pieces during a certain user's turn
    if (c.counter%2 != 0 && chb[curlL][curlR].getPlayer().equals("b")){
      System.out.println("you can't move other peoples pieces cheater");
      return false;
    }
    if (c.counter%2 == 0 && chb[curlL][curlR].getPlayer().equals("a")){
      System.out.println("you can't move other peoples pieces cheater");
      return false;
    }

    // pawns cannot move diagonally unless it is to eat another piece
    if (chb[curlL][curlR].getPlayer().equals("a") &&
    chb[curlL][curlR].toString().equals("P") &&
    chb[newlL][newlR].toString().equals(".") &&
    ((newl - curl) == 11 || (newl - curl) == 9)){
      System.out.println("you can't move a pawn diagonally except to eat");
      return false;
    }
    if (chb[curlL][curlR].getPlayer().equals("b") &&
    chb[curlL][curlR].toString().equals("P") &&
    chb[newlL][newlR].toString().equals(".") &&
    ((newl - curl) == -11 || (newl - curl) == -9)){
      System.out.println("you can't move a pawn diagonally except to eat");
      return false;
    }

    if (chb[curlL][curlR].getPlayer().equals("a") &&
    chb[curlL][curlR].toString().equals("P") &&
    !chb[newlL][newlR].toString().equals(".") &&
    ((newl - curl) == 10)){
      System.out.println("you can't have a pawn eat in front.");
      return false;
    }
    if (chb[curlL][curlR].getPlayer().equals("b") &&
    chb[curlL][curlR].toString().equals("P") &&
    !chb[newlL][newlR].toString().equals(".") &&
    ((newl - curl) == -10)){
      System.out.println("you can't have a pawn eat in front.");
      return false;
    }

    // if user eats the other's king, user wins
    if (chb[newlL][newlR].toString().equals("K") &&
    !(chb[curlL][curlR].getPlayer().equals(chb[newlL][newlR].getPlayer()))){
      c.KingAlive = false;
      System.out.println("YOU WIN!");
      return true;
    }

    // if <current location> does not have a chesspiece on it
    if (chb[curlL][curlR].toString().equals(".")){
      System.out.println("Nuthin' here to move.");
      return false;
    }

    // if user's <new location> leads to its own piece
    if(chb[curlL][curlR].getPlayer().equals(chb[newlL][newlR].getPlayer())){
      System.out.println("Don't eat yourself");
      return false;
    }

    // if user tries to move a piece (that is not a knight) when another chesspiece is in front
    /*
    if (!(chb[curlL][curlR].toString().equals("N"))){
      if (chb[curlL][curlR].getPlayer().equals("a")){
        if (!(chb[(curlL)+1][curlR].toString().equals("."))){
          System.out.println("Ya can't skip people.");
          return false;
        }
      }else{
        if (!(chb[curlL-1][curlR].toString().equals("."))){
          System.out.println("Ya can't skip people.");
          return false;
        }
      }
    }
    */
    // if move is not valid via chess rules
    if (!(chb[curlL][curlR].isValid(splitted[1]))){
      System.out.println("Invalid move bro.");
      return false;
    }

    // promo case should be last bc it passes all the false tests
    if (chb[curlL][curlR].toString().equals("P")){
      if (newlL == 0 || newlL == 7){
        Scanner input = new Scanner(System.in);
        String change = "";
        char playerType = chb[curlL][curlR].getPlayer().charAt(0);
        System.out.println();
        System.out.println("What do you want your pawn to be promoted to? (Q, N, R, or B)");
        System.out.print(">>> ");
        change = input.next();
        boolean done = false;
        while (!(done)){
          if (change.equals("Q")){
            chb[newlL][newlR] = new Queen(newlL, newlR, playerType);
            done = true;
          } else if (change.equals("N")){
            chb[newlL][newlR] = new Knight(newlL, newlR, playerType);
            done = true;
          } else if (change.equals("R")){
            chb[newlL][newlR] = new Rook(newlL, newlR, playerType);
            done = true;
          } else if (change.equals("B")){
            chb[newlL][newlR] = new Bishop(newlL, newlR, playerType);
            done = true;
          } else {
            System.out.println("Invalid input. Q, N, R, or B");
            System.out.print(">>> ");
          }
        }
      } else {
        chb[curlL][curlR].move(splitted[1]);
        chb[newlL][newlR] = chb[curlL][curlR];
      }
    } else {
      chb[curlL][curlR].move(splitted[1]);
      chb[newlL][newlR] = chb[curlL][curlR];
    }

    chb[curlL][curlR] = new Blank(curlL, curlR);

    return true;

    // more invalid user inputs
  }catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Out the bounds of chessboard.");
    System.out.println("<current location> <new location>");
    return false;
  }
}

}
