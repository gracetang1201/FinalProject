import java.io.*
public class Chess{
    private boolean KingIsAlive = true;
    Chessboard cb = new Chessboard();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main (String[]args){
	while(KingIsAlive){
	    whiteTurn();
	    blackTurn();
	}
    }

    public String whiteTurn(){
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
	       cb[cur/10][cur%10].move(newloc/10, newloc%10);
	       cb[cur/10][cur%10] = new Blank(cur/10, cur%10);
	       return "good move!";
	   }

	   whiteTurn = false;
	
    }
    public String blackTurn(){
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
	       cb[cur/10][cur%10].move(newloc/10, newloc%10);
	       cb[cur/10][cur%10] = new Blank(cur/10, cur%10);
	       return "good move!";
	   }

	whiteTurn = true;;
	
    }
}
    
