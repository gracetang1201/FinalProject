import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.NumberFormatException;
/*
  public class Chessboard{
  private boolean KingIsAlive;
  private static Chesspieces[][]cb; //= new Chesspieces[8][8];
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main (String[]args){
  //Chesspieces[][] n = new Chesspieces[8][8];
  Chessboard n = new Chessboard();
  KingIsAlive = true;
  while(KingIsAlive){
  whiteTurn(cb);
  blackTurn(cb);
  }
  }
  public Chessboard(){
  KingIsAlive = true;
  cb = new Chesspieces[8][8];
  for (int c = 2; c <= 5; c++){
  for (int r = 0; r < 8; r++){
  Blank b = new Blank(r, c);
  set(cb, b, r, c);
  }
  }
  fillInPiecesStart();
  }
  public String toString(Chesspieces[][] cb){
  String ans = "";
  for (int r = 0; r < cb.length; r++){
  for (int c = 0; c < cb[r].length; c++){
  if (c == cb[r].length - 1){
  ans = ans + cb[r][c].toString() + "\n" ;
  }else{
  ans = ans + cb[r][c].toString() + " ";
  }
  }
  }
  return ans;
  }
  public static void fillInPiecesStart(Chesspieces[][] cb){
  for (int insertPawn = 0; insertPawn < 8; insertPawn++){
  Pawn wp1 = new Pawn(insertPawn, 1, 'a');
  cb[1][insertPawn] = wp1;
  }
  //Pawns for PlayerB
  for (int insertPawn = 0; insertPawn < 8; insertPawn++){
  Pawn wp1 = new Pawn(insertPawn, 6, 'b');
  //cb[1][insertPawn] = wp1;
  set(cb, wp1, 6, insertPawn);
  }
  //Rooks for PlayerA
  Rook rka = new Rook(0, 0, 'a');
  //cb[0][0] = rka;
  set(cb, rka, 0, 0);
  Rook rka1 = new Rook(0, 7, 'a');
  //cb[0][7] = rka1;
  set(cb, rka1, 0, 7);
  //Rooks for PlayerB
  Rook rkb = new Rook (7, 0, 'b');
  //cb[7][0] = rkb;
  set(cb, rkb, 7, 0);
  Rook rkb1 = new Rook(7, 7, 'b');
  //cb[7][7] = rkb1;
  set(cb, rkb1, 7, 7);
  //Knight for PlayerA
  Knight kna = new Knight(0, 1, 'a');
  //cb[0][1] = kna;
  set(cb, kna, 0, 1);
  Knight kna1 = new Knight(0, 6, 'a');
  //cb[0][6] = kna1;
  set(cb, kna1, 0, 6);
  //Knights for PlayerB
  Knight knb = new Knight(7, 1, 'b');
  //cb[7][1] = knb;
  set(cb, knb, 7, 1);
  Knight knb1 = new Knight(7, 6, 'b');
  //cb[7][6] = knb1;
  set(cb, knb1, 7, 6);
  //Bishops for PlayerA
  Bishop bia = new Bishop(0, 2, 'a');
  //cb[0][2] = bia;
  set(cb, bia, 0, 2);
  Bishop bia1 = new Bishop(0, 5, 'a');
  //cb[0][5] = bia1;
  set(cb, bia1, 0, 5);
  //Bishops for PlayerB
  Bishop bib = new Bishop(7, 5, 'b');
  //cb[7][5] = bib;
  set(cb, bib, 7, 5);
  Bishop bib1 = new Bishop(7, 2, 'b');
  //cb[7][2] = bib1;
  set(cb, bib1, 7, 2);
  //Queen for PlayerA
  Queen qa = new Queen(0, 3, 'a');
  //cb[0][3] = qa;
  set(cb, qa, 0, 3);
  //Queen for PlayerB
  Queen qb = new Queen(7, 4, 'b');
  //cb[7][4] = qb;
  set(cb, qb, 7, 4);
  //King for PlayerA
  King ka = new King(0, 4, 'a');
  //cb[0][4] = ka;
  set(cb, ka, 0, 4);
  //King for PlayerB
  King kb = new King(7, 3, 'b');
  //cb[7][3] = kb;
  set(cb, kb, 7, 3);
  }
  public String whiteTurn(Chesspieces[][] cb){
  int cur = locationtoInt(br.readLine());
  int newloc = locationtoInt(br.readLine());
  if(cb[cur/10][cur%10].player=='b'){
  return "ya can't move your opponents pieces cheater";
  }
  if(cb[newloc/10][newloc%10].toString().equals("K")){
  KingIsAlive = false;
  return "checkmate";
  }
  if(cb[cur/10][cur%10].toString().equals("P") &&
  cur + 1 == newloc &&
  !cb[newloc/10][newloc%10].equals(".") ||
  (cb[cur/10][cur%10].toString().equals("P") &&
  (cur + 11 == newloc ^ cur + 9 == newloc) &&
  cb[newloc/10][newloc%10].equals("."))){
  return "you can't do that";
  }else{
  cb[cur/10][cur%10].move(inttoLocation(newloc));
  cb[cur/10][cur%10] = new Blank(cur/10, cur%10);
  return "good move!";
  }
  }
  public String blackTurn(Chesspieces[][] cb){
  int cur = locationtoInt(br.readLine());
  int newloc = locationtoInt(br.readLine());
  if(cb[cur/10][cur%10].player=='a'){
  return "ya can't move your opponents pieces cheater";
  }
  if(cb[newloc/10][newloc%10].toString().equals("K")){
  KingIsAlive = false;
  return "checkmate";
  }
  if(cb[cur/10][cur%10].toString().equals("P") &&
  cur + 1 == newloc &&
  !cb[newloc/10][newloc%10].equals(".") ||
  (cb[cur/10][cur%10].toString().equals("P") &&
  (cur + 11 == newloc ^ cur + 9 == newloc) &&
  cb[newloc/10][newloc%10].equals("."))){
  return "you can't do that";
  }else{
  cb[cur/10][cur%10].move(inttoLocation(newloc));
  cb[cur/10][cur%10] = new Blank(cur/10, cur%10);
  return "good move!";
  }
  ;
  }
  public static void set(Chesspieces[][] c, Chesspieces x, int row, int col){
  //cb[locationtoInt(newlocation)/10][locationtoInt(newlocation)%10] = x;
  c[row][col] = x;
  }
  public Chesspieces get(String location){
  return cb[locationtoInt(location)/10][locationtoInt(location)%10];
  }
*/

//}
public class Chessboard{
    //instance variables:
    private boolean KingAlive;
    // private boolean whiteTurn;
    // private boolean blackTurn;
    private int counter;
    private Chesspieces[][]cb;
    // public static void main (String[]args){
    //   Chessboard n = new Chessboard();
    //
    // }

    public static void main(String[]args){
	Scanner user_input = new Scanner(System.in);
	Chessboard c = new Chessboard();
	System.out.println(c); // prints chesboard
	while (c.KingAlive){
	    while (c.counter%2!=0){
		String wturn;
		System.out.println("Player 1 turn: ");
		wturn = user_input.nextLine();
		if (doAction(wturn,c.cb)){
		    c.counter += 1;
		    System.out.println(c);
		    
		}
	    }
	    while (c.counter%2==0){
		String bturn;
		System.out.println("Player 2 turn: ");
		bturn = user_input.nextLine();
		if (doAction(bturn,c.cb)){
		    c.counter += 1;
		    System.out.println(c);
		}
	    }
	    // whiteturn();
	    // blackturn();
	}
    }
    public Chessboard(){
	KingAlive = true;
	counter = 1;
	// whiteTurn = true;
	// blackTurn = false;
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
		    ans = ans + cb[r][c].toString() + "\n" ;
		}else{
		    ans = ans + cb[r][c].toString() + " ";
		}
	    }
	}
	return ans;
    }

    public static int locationtoInt(String location){
	// 	String realRet = "";
	int ret = 0;
	String fir = location.substring(0,1);
        ret += Integer.parseInt(location.substring(1));
	if (fir.equals("a")) ret += 10;
	if (fir.equals("b")) ret += 20;
	if (fir.equals("c")) ret += 30;
	if (fir.equals("d")) ret += 40;
	if (fir.equals("e")) ret += 50;
	if (fir.equals("f")) ret += 60;
	if (fir.equals("g")) ret += 70;
	if (fir.equals("h")) ret += 80;
	//switch(location.substring(0,1)){
	//case "a": ret =  10 + Integer.parseInt(location.substring(1));
	//case "b": ret =  20 + Integer.parseInt(location.substring(1));
	//case "c": ret =  30 + Integer.parseInt(location.substring(1));
	//case "d": ret =  40 + Integer.parseInt(location.substring(1));
	//case "e": ret =  50 + Integer.parseInt(location.substring(1));
	//case "f": ret =  60 + Integer.parseInt(location.substring(1));
	//case "g": ret =  70 + Integer.parseInt(location.substring(1));
	//case "h": ret =  80 + Integer.parseInt(location.substring(1));
	//default: break;
	//} 
	return ret;
    }

    public static String inttoLocation(int location){
	String ret = "";
	switch(location/10){
	case 1: ret =  "a" + location%10;
	case 2: ret =  "b" + location%10;
	case 3: ret =  "c" + location%10;
	case 4: ret =  "d" + location%10;
	case 5: ret =  "e" + location%10;
	case 6: ret =  "f" + location%10;
	case 7: ret =  "g" + location%10;
	case 8: ret =  "h" + location%10;
	default: break;

	}

	return ret;
    }


    private void set(Chesspieces c, int x, int y){
	cb[x][y] = c;
	c.currentLocation = 10*x+y;
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

    public static boolean doAction(String string,Chesspieces[][] chb){
	String[] splitted = string.split("\\s+");
	int curl = 0;
	int newl = 0;
	Chesspieces piece;
	// System.out.println(Arrays.toString(splitted));
	if (splitted.length != 2){
	    System.out.println("<current location> <new location>");
	    return false;
	}
	try{

      
	    curl = locationtoInt(splitted[0]);
	    newl = locationtoInt(splitted[1]);
	    /* if(chb[curl/10][curl%10].toString().equals("P")){
		if(Math.abs(newl - curl) == 1 && !chb[newl/10][newl%10].toString().equals(".")){
		    System.out.println(1);
		    return false;
		}
		if(Math.abs(newl - curl) == 11 || Math.abs(newl - curl) == 9 && chb[newl/10][newl%10].toString().equals(".")){
		    System.out.println(2);
		    return false;
		}
		}*/

	    curl = locationtoInt(splitted[0]);

	    // newl = locationtoInt(splitted[1]);
	    chb[curl/10][curl%10].move(splitted[1]);
       
	    
	    chb[newl/10][newl%10] = chb[curl/10][curl%10];
	    /*
	    for (int i = 0; i < 8; i++) {
		System.out.println(Arrays.toString(chb[i]));
		}*/
	    // System.out.println(locationtoInt(splitted[0]));

	    return true;
	}catch (NumberFormatException e){
	    return false;
	}/*catch (ArrayIndexOutOfBoundsException e){
	   System.out.println("CURRENT");
	   System.out.println(curl);
	   System.out.println(curl/10);
	   System.out.println(curl%10);
	   System.out.println("NEW");
	   System.out.println(newl);
	   System.out.println(newl/10);
	   System.out.println(newl%10);
	   System.out.println("-----");
	   System.out.println(splitted[0]);
	   System.out.println(splitted[1]);
	   System.out.println("======");
	   System.out.println(locationtoInt(splitted[0]));
	   System.out.println(locationtoInt(splitted[1]));
	   }*/
	// return true; // no need this?????
    }
}

