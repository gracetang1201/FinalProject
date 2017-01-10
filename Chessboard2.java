import java.lang.*;
import java.util.Scanner;
public class Chessboard2{
    private Chesspieces2[][]cb;
    private boolean KingAlive;
    private static int counter = 0;
    public static void main (String[]args){
	Scanner user_input = new Scanner(System.in);
	Chessboard2 c = new Chessboard2();

	King2 king = new King2(4, 4, 'a');
	Blank2 blank = new Blank2 (0, 4);
	c.set(king, 5, 4);
	System.out.println(c);


	while (c.KingAlive){
	    while(c.counter%2==0){
		String wturn;
		System.out.println("Player 1 turn: ");
		wturn = user_input.nextLine();
		if(c.doAction(wturn)){
		    c.counter += 1;
		    System.out.println(c);
		}
	    }
	    while(c.counter%2!=0){
		String bturn;
		System.out.println("Player 2 turn: ");
		bturn = user_input.nextLine();
		System.out.println( bturn);
		if(c.doAction(bturn)){
		    c.counter += 1;
		    System.out.println(c);
		}
	    }
	}

    }
    public Chessboard2(){
	cb = new Chesspieces2[8][8];
	KingAlive = true;
	for (int c = 0; c < 8; c++){
	    for (int r = 0; r < 8; r++){
		cb[r][c] = new Blank2(r, c);
	    }
	}
	fillInPiecesStart();
    }
    public void set(Chesspieces2 c, int x, int y){
	cb[x][y] = c;
    }
    public boolean doAction(String str){
	int currentLocation = locationtoInt(str.substring(0,2));
	int newLocation = locationtoInt(str.substring(3));
	if (cb[currentLocation%10][currentLocation/10].toString().equals(".")){
	    System.out.println("theres nothing there dummy");
	    return false;
	}

	  
	if (cb[newLocation%10][newLocation/10].toString().equals("K")){
	    KingAlive = false;
	    System.out.println("YOU WON YOU GO MY DUDE");
	}
	if (cb[currentLocation%10][currentLocation/10].toString().equals("P")&&
	    Math.abs(newLocation - currentLocation) == 1&&
	    !cb[newLocation%10][currentLocation/10].toString().equals(".")){
	    return false;
	}
	set(get(currentLocation%10, currentLocation/10), newLocation%10, newLocation/10);
	//Blank2 b = new Blank(currentLocation/10, currentLocation%10);
	Blank2 b = new Blank2(currentLocation/10, currentLocation%10);

	cb[currentLocation%10][currentLocation/10] = b;
	return true;
    }
    public String toString(){
	String ans = "";
	for (int r = 0; r < cb.length; r++){
	    for (int c = 0; c < cb[r].length; c++){
		if (c == cb[r].length - 1){
		    ans = ans + cb[r][c].toString() + "\n" ;
		}else{
		    ans = ans + cb[r][c].toString() + "";
		}
	    }
	}
	return ans;
    }
    public int locationtoInt(String location){
	int ret = 0;
	switch(location.substring(0,1)){
	case "a": ret =  00 + Integer.parseInt(location.substring(1));
	    break;
	case "b": ret =  10 + Integer.parseInt(location.substring(1));
	    break;
	case "c": ret =  20 + Integer.parseInt(location.substring(1));
	    break;
	case "d": ret =  30 + Integer.parseInt(location.substring(1));
	    break;
	case "e": ret =  40 + Integer.parseInt(location.substring(1));
	    break;
	case "f": ret =  50 + Integer.parseInt(location.substring(1));
	    break;
	case "g": ret =  60 + Integer.parseInt(location.substring(1));
	    break;
	case "h": ret =  70 + Integer.parseInt(location.substring(1));
	    break;
	default: break;
	}
	return ret;
    }
    public Chesspieces2 get(int x, int y){
	return cb[x][y];
    }
    public void fillInPiecesStart(){
	for (int insertPawn = 0; insertPawn < 8; insertPawn++){
	    Pawn2 wp1 = new Pawn2(insertPawn, 1, 'a');
	    set(wp1, 1, insertPawn);
	}
	//Pawns for PlayerB
	for (int insertPawn = 0; insertPawn < 8; insertPawn++){
	    Pawn2 wp1 = new Pawn2(insertPawn, 6, 'b');
	    set(wp1, 6, insertPawn);
	}
	//Rooks for PlayerA
	Rook2 rka = new Rook2(0, 0, 'a');
	set(rka, 0, 0);
	Rook2 rka1 = new Rook2(0, 7, 'a');
	set(rka1, 0, 7);
	//Rooks for PlayerB
	Rook2 rkb = new Rook2 (7, 0, 'b');
	set(rkb, 7, 0);
	Rook2 rkb1 = new Rook2(7, 7, 'b');
	set(rkb1, 7, 7);
	//Knight for PlayerA
	Knight2 kna = new Knight2(0, 1, 'a');
	set(kna, 0, 1);
	Knight2 kna1 = new Knight2(0, 6, 'a');
	set(kna1, 0, 6);
	//Knights for PlayerB
	Knight2 knb = new Knight2(7, 1, 'b');
	set(knb, 7, 1);
	Knight2 knb1 = new Knight2(7, 6, 'b');
	set(knb1, 7, 6);
	//Bishops for PlayerA
	Bishop2 bia = new Bishop2(0, 2, 'a');
	set(bia, 0, 2);
	Bishop2 bia1 = new Bishop2(0, 5, 'a');
	set(bia1, 0, 5);
	//Bishops for PlayerB
	Bishop2 bib = new Bishop2(7, 5, 'b');
	set(bib, 7, 5);
	Bishop2 bib1 = new Bishop2(7, 2, 'b');
	set(bib1, 7, 2);
	//Queen for PlayerA
	Queen2 qa = new Queen2(0, 3, 'a');
	set(qa, 0, 3);
	Queen2 qb = new Queen2(7, 4, 'b');
	set(qb, 7, 4);
	//King for PlayerA
	King2 ka = new King2(0, 4, 'a');
	set(ka, 0, 4);
	//King for PlayerB
	King2 kb = new King2(7, 3, 'b');
	set(kb, 7, 3);
    }
}
