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
		if (r == 7 || r == 0){
		    switch(c){
		    case 0: pieceAt = 'R';
			break;
		    case 1: pieceAt = 'N';
			break;
		    case 2: pieceAt = 'B';
			break;
		    case 3: pieceAt = 'Q';
			break;
		    case 4: pieceAt = 'K';
			break;
		    case 5: pieceAt = 'B';
			break;
		    case 6: pieceAt = 'N';
			break;
		    case 7: pieceAt = 'R';
			break;
		           
		    }
		}
		if (r == 6 || r == 1){
		    pieceAt = 'P';
		}
		cb[r][c] = pieceAt;
	    }
	    
	}
	
	for(int r = 2; r < 8; r++){
	    for(int c = 0; c < 8; c++){
		cb[r][c] = '.';
	    }
	}
    }
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
