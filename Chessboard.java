import java.io.*;
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
    public static String inttoLocation(int location){
	String ret;
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
    }
*/public class Chessboard{
    //instance variables:
    private boolean KingAlive;
    private Chesspieces[][]cb;
    public static void main (String[]args){
	Chessboard n = new Chessboard();
	
    }
    public Chessboard(){
	KingAlive = true;
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
}


