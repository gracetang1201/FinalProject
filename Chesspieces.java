public abstract class Chesspieces{

    //example: a3 --> substring/parseInt into 'a' and 3 --> change into 13 
    public int currentLocation;

    //moves piece @ current to newlocation: use substring to analyze locations
    //maybe use a switch case to figure out what'a-e' represent in terms of
    //2d array
    //the first thing move is going to do is change newlocation to int
    abstract void move(String newlocation);

    abstract boolean isValid(String newlocation);

    public static int locationtoInt(String location){
	this.currentLocation = 0;
	switch(location.substring(0,1)){
	case "a": return 10 + Integer.parseInt(location.substring(1));
	    break;
	case "b": return 20 + Integer.parseInt(location.substring(1));
	    break;
	case "c": return 30 + Integer.parseInt(location.substring(1));
	    break;
	case "d": return 40 + Integer.parseInt(location.substring(1));
	    break;
	case "e": return 50 + Integer.parseInt(location.substring(1));
	    break;
	case "f": return 60 + Integer.parseInt(location.substring(1));
	    break;
	case "g": return 70 + Integer.parseInt(location.substring(1));
	    break;
	case "h": return 80 + Integer.parseInt(location.substring(1));
	    break;
	    
	}
    }
}
