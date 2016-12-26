public class Chessboard{
    public static void main (String[]args){
	Chessboard n = new Chessboard();
	System.out.println(n);
    }
    private char[][]cb;
    //int[][]Chessboard = new int[8][8];
    public Chessboard(){
	cb = new char[8][8];
	char pieceAt = ' ';
	for (int r = 0; r < 8; r++){
	    for (int c = 0; c < 8; c++){
	 
		if (r == 6 || r == 1){
		    cb[r][c] = 'P';
		
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

    public String toString(){
	String ans = "";
	for (int r = 0; r < 8; r++){
	    for(int c = 0; c < 8; c++){
		if (c == cb[r].length - 1){
		    ans = ans + cb[r][c] + "\n" ;
		}else{
		    ans = ans + cb[r][c] + " ";
		}
	    }
	}
	return ans;
    }
    
}
