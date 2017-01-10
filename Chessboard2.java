import java.util.Scanner;
public class Chessboard2{
    private Chesspieces[][]cb;
    private boolean KingAlive;
    private static int counter = 0;
    public static void main (String[]args){
	Scanner user_input = new Scanner(System.in);
	Chessboard2 c = new Chessboard2();
	King k = new King(0, 0, 'a');
	//set(
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
	cb = new Chesspieces[8][8];
	KingAlive = true;
	for (int c = 0; c < 8; c++){
	    for (int r = 0; r < 8; r++){
		cb[r][c] = new Blank(r, c);
	    }
	}
	fillInPiecesStart();
    }
    public void set(Chesspieces c, int x, int y){
	cb[x][y] = c;
	c.currentLocation = 10*y + x;
    }
    public boolean doAction(String str){
	int currentLocation = locationtoInt(str.substring(0,2));
	int newLocation = locationtoInt(str.substring(3));
	set(get(currentLocation%10, currentLocation/10), newLocation%10, newLocation/10);
	//cb[newLocation/10][newLocation%10] = cb[currentLocation/10][currentLocation%10];
	Blank b = new Blank(currentLocation/10, currentLocation%10);
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
    public Chesspieces get(int x, int y){
	return cb[x][y];
    }
    public void fillInPiecesStart(){
	for (int insertPawn = 0; insertPawn < 8; insertPawn++){
	    Pawn wp1 = new Pawn(insertPawn, 1, 'a');
	    set(wp1, 1, insertPawn);
	}
	//Pawns for PlayerB
	for (int insertPawn = 0; insertPawn < 8; insertPawn++){
	    Pawn wp1 = new Pawn(insertPawn, 6, 'b');
	    set(wp1, 6, insertPawn);
	}
	//Rooks for PlayerA
	Rook rka = new Rook(0, 0, 'a');
	set(rka, 0, 0);
	Rook rka1 = new Rook(0, 7, 'a');
	set(rka1, 0, 7);
	//Rooks for PlayerB
	Rook rkb = new Rook (7, 0, 'b');
	set(rkb, 7, 0);
	Rook rkb1 = new Rook(7, 7, 'b');
	set(rkb1, 7, 7);
	//Knight for PlayerA
	Knight kna = new Knight(0, 1, 'a');
	set(kna, 0, 1);
	Knight kna1 = new Knight(0, 6, 'a');
	set(kna1, 0, 6);
	//Knights for PlayerB
	Knight knb = new Knight(7, 1, 'b');
	set(knb, 7, 1);
	Knight knb1 = new Knight(7, 6, 'b');
	set(knb1, 7, 6);
	//Bishops for PlayerA
	Bishop bia = new Bishop(0, 2, 'a');
	set(bia, 0, 2);
	Bishop bia1 = new Bishop(0, 5, 'a');
	set(bia1, 0, 5);
	//Bishops for PlayerB
	Bishop bib = new Bishop(7, 5, 'b');
	set(bib, 7, 5);
	Bishop bib1 = new Bishop(7, 2, 'b');
	set(bib1, 7, 2);
	//Queen for PlayerA
	Queen qa = new Queen(0, 3, 'a');
	set(qa, 0, 3);
	Queen qb = new Queen(7, 4, 'b');
	set(qb, 7, 4);
	//King for PlayerA
	King ka = new King(0, 4, 'a');
	set(ka, 0, 4);
	//King for PlayerB
	King kb = new King(7, 3, 'b');
	set(kb, 7, 3);
    }
}
