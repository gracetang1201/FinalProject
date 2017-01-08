public class Tester{
    private Chesspieces[][]cb  = new Chesspieces[8][8];
    public void fillInPiecesStart(){
	for (int insertPawn = 0; insertPawn < 8; insertPawn++){
	    Pawn wp1 = new Pawn(insertPawn, 1, 'a');
	    //c[1][insertPawn] = wp1;
	    set(cb, wp1, 1, insertPawn);
	}
    }
	public static void set(Chesspieces[][] c, Chesspieces x, int row, int col){
	    //cb[locationtoInt(newlocation)/10][locationtoInt(newlocation)%10] = x;
	    c[row][col] = x;
	}
}
    
