import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;;


public class Chessboard{
    //instance variables:
    private boolean KingAlive;
    private int counter;
    private Chesspieces[][]cb;


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
		    ans = ans + cb[r][c].toString() + "\n" ;
		}else{
		    ans = ans + cb[r][c].toString() + " ";
		}
	    }
	}
	return ans;
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

    public static boolean doAction(String string,Chesspieces[][] chb, Chessboard c){
	String[] splitted = string.split("\\s+");
	int curl = 0;
	int newl = 0;
	Chesspieces piece;

	if (string.equals("quit")){
	    System.exit(0);
	}
	try{
	    curl = Integer.parseInt(locationtoInt(splitted[0]));
	    newl = Integer.parseInt(locationtoInt(splitted[1]));
	} catch (StringIndexOutOfBoundsException e){
	    System.out.println("<current location> <new location>");
	    return false;
	} catch (NumberFormatException e){
	    System.out.println("<current location> <new location>");
	    return false;
	}

	try{
	    if (splitted.length != 2){
		System.out.println("<current location> <new location>");
		return false;
	    }

	    if (chb[newl/10][newl%10].toString().equals("K")){
		c.KingAlive = false;
		System.out.println("YOU WIN!");
		return true;
	    }

	    if (chb[curl/10][curl%10].toString().equals(".")){
		System.out.println("Nuthin' here to move.");
		return false;
	    }

	    if (!(chb[curl/10][curl%10].isValid(splitted[1]))){
		System.out.println("Invalid move bro.");
		return false;
	    }
	    chb[curl/10][curl%10].move(splitted[1]);
	    chb[newl/10][newl%10] = chb[curl/10][curl%10];
	    chb[curl/10][curl%10] = new Blank(curl/10, curl%10);
	    return true;
	}catch (ArrayIndexOutOfBoundsException e){
	    System.out.println("Out the bounds of chessboard.");
	    System.out.println("<current location> <new location>");
	    return false;
	}
    }

}
