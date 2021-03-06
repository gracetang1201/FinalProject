import java.io.Console;
import java.util.Scanner;
public class StartScreen{

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  public static final String ANSI_CLS = "\u001b[2J";

  private static String chess1 = "      ___           ___           ___           ___           ___     ";
  private static String chess2 = "     /  /\\         /__/\\         /  /\\         /  /\\         /  /\\    ";
  private static String chess3 = "    /  /:/         \\  \\:\\       /  /:/_       /  /:/_       /  /:/_   ";
  private static String chess4 = "   /  /:/           \\__\\:\\     /  /:/ /\\     /  /:/ /\\     /  /:/ /\\  ";
  private static String chess5 = "  /  /:/  ___   ___ /  /::\\   /  /:/ /:/_   /  /:/ /::\\   /  /:/ /::\\ ";
  private static String chess6 = " /__/:/  /  /\\ /__/\\  /:/\\:\\ /__/:/ /:/ /\\ /__/:/ /:/\\:\\ /__/:/ /:/\\:\\";
  private static String chess7 = " \\  \\:\\ /  /:/ \\  \\:\\/:/__\\/ \\  \\:\\/:/ /:/ \\  \\:\\/:/~/:/ \\  \\:\\/:/~/:/" ;
  private static String chess8 = "  \\  \\:\\  /:/   \\  \\::/       \\  \\::/ /:/   \\  \\::/ /:/   \\  \\::/ /:/ ";
  private static String chess9 = "   \\  \\:\\/:/     \\  \\:\\        \\  \\:\\/:/     \\__\\/ /:/     \\__\\/ /:/  ";
  private static String chess10= "    \\  \\::/       \\  \\:\\        \\  \\::/        /__/:/        /__/:/   ";
  private static String chess11= "     \\__\\/         \\__\\/         \\__\\/         \\__\\/         \\__\\/    ";

  public static void initialSplash(){
    String newLine = System.getProperty("line.separator");
    System.out.println(chess1+newLine+chess2+newLine+chess3+newLine+chess4+newLine+chess5+newLine+chess6+newLine+chess7+newLine+chess8+newLine+chess9+newLine+chess10+newLine+chess11+newLine);
    try{
      Thread.sleep(1000);
      System.out.println(ANSI_RED + "                         -- Rook No Further --" + ANSI_RESET);
      // System.out.println(ANSI_GREEN + "                         -- Rook No Further --" + ANSI_RESET);
      // System.out.println(ANSI_YELLOW + "                         -- Rook No Further --" + ANSI_RESET);
      // System.out.println(ANSI_BLUE + "                         -- Rook No Further --" + ANSI_RESET);
      // System.out.println(ANSI_PURPLE + "                         -- Rook No Further --" + ANSI_RESET);
      // System.out.println(ANSI_CYAN + "                         -- Rook No Further --" + ANSI_RESET);
      // System.out.println(ANSI_WHITE + "                         -- Rook No Further --" + ANSI_RESET);
    } catch(InterruptedException e){
      System.out.println("INTERRUPTED");
    }
    try{
      Thread.sleep(1000);
      System.out.println("                       Grace Tang and Laura Goon");
    } catch(InterruptedException e){
      System.out.println("INTERRUPTED");
    }
  }

  public static void menu(){
    try{
      Thread.sleep(1000);
      System.out.println();
      System.out.println();
      System.out.println(ANSI_CYAN +"          type   :"+ ANSI_WHITE + "instructions          "+ ANSI_GREEN +"for instructions");
      System.out.println(ANSI_CYAN +"          type   :"+ ANSI_WHITE +"start                 "+ ANSI_GREEN +"to start game");
      System.out.println(ANSI_CYAN +"          type   :"+ ANSI_WHITE + "menu                  "+ ANSI_GREEN +"to display menu again");
      System.out.println(ANSI_CYAN +"          type   :"+ ANSI_WHITE +"quit                  "+ ANSI_GREEN +"to quit at anytime"+ ANSI_RESET);
      System.out.println();
    } catch(InterruptedException e){
      System.out.println("INTERRUPTED");
    }
  }

  public static void instruct(){
    String[] instructs = {"King",
                          "The king is the most important piece, since losing him means the end of the game. But he is also one of the weakest. So very often he needs his friends to protect him. The king can move one square in any direction - up, down, to the sides, and diagonally." + "\n" + "\n" + "The king may never move himself onto a square where he could be captured (no losing on purpose). If your opponent ever moves their king onto a square where you can take it, don't grab the king and laugh 'hahahaha, I win!' Instead, you should explain why they can't move there. Then your opponent can put the king back where it was, and choose a different move." + "\n" + "\n" + "Checkmate" + "\n" + "When another piece threatens to capture the king, it is called 'check.' When there is no way for the king to escape check, it is called 'checkmate.' As stated before, that is how you win. There are only three ways a king can get out of check: move out of the way, block the check with another piece, or capture the piece threatening the king. If a king cannot escape checkmate then the game is over. Customarily the king is not captured or removed from the board, the game is simply declared over.",
                          "Queen",
                          "The queen is the most powerful piece. Like the king, she can move in any one straight direction - forward, backward, sideways, or diagonally - but unlike him, she's very speedy. In fact, she can move as far as you like as long as she does not move through any other pieces. And, like with all pieces, if the queen captures an opponent's piece, that's the square she stops on.",
                          "Rook",
                          "The rook moves much like the queen: as far as it wants along straight lines, but only forward, backward, and to the sides (not diagonally).",
                          "Bishop",
                          "The bishop is the 'other half' of the queen. It moves as far as it wants, but only diagonally. You start with one bishop on a light square and one bishop on a dark square, and you will notice, only moving on diagonals, each one is stuck on the color it starts on. Bishops work well together because each covers the squares the other one can't.",
                          "Knight",
                          "Knights move in a very different way from the other pieces - going two squares in one direction, and then one more move at a 90 degree angle, just like the shape of an 'L'. Knights are also the only pieces that can move over other pieces. People often say knights 'hop' because of that special ability.",
                          "Pawn",
                          "Half of your starting team is pawns, so it's very important to understand how to use these little guys, even though they are not very strong. Pawns are unusual because they move in one way, but capture in a different way. When they move, they just go forward, but when they capture they go diagonally. Pawns can only move forward one square at a time, except for their very first move where they can move forward two squares or one. Pawns can only capture one square diagonally in front of them. They can never move or capture backwards." + "\n" + "\n" + "Because they move and capture differently, the pawn is the only piece that can get blocked by enemy pieces: if there is another piece directly in front of a pawn he cannot move past or capture that piece."
                        };
    try{
      Thread.sleep(500);
      System.out.print(ANSI_CLS);
      System.out.flush();
    } catch(InterruptedException e){
      System.out.println("INTERRUPTED");
    }
    Scanner menuIn = new Scanner(System.in);
    String menInput = "";

    int i = 0;
    while (i < instructs.length){
        System.out.print(ANSI_CLS);
        System.out.flush();
        System.out.println(instructs[i]);
        System.out.println(instructs[i+1]);
        System.out.println();
        if (i != 0){
          System.out.println("type" + ANSI_CYAN + " back " + ANSI_RESET + "to go back to previous");
        }
        if (i < 10){
          System.out.println("type" + ANSI_CYAN + " next " + ANSI_RESET + "to continue");
        }
        System.out.println("type" + ANSI_CYAN + " menu " + ANSI_RESET + "to return to previous menu");
        System.out.print(">>> ");
        menInput = menuIn.next();
        if (menInput.equals("menu")){
          i = 20;
          menu();
        } else if (menInput.equals("next")){
          if (i >= 10){
            System.out.println("No more");
            System.out.print(">>> ");
            menInput = menuIn.next();
          } else{
            i += 2;
          }
        } else if (menInput.equals("back")){
          if (i == 0){
            System.out.println("Nothing to go back to");
            System.out.print(">>> ");
            menInput = menuIn.next();
          } else{
            i -= 2;
          }
        }else{
          System.out.println("Please read instructions!! Invalid input0");
          System.out.print(">>> ");
          menInput = menuIn.next();
        }
  }

  }

    public static void followCmd(String input){
	Console c = System.console();
	if (input.equals("menu")){ // !!!!!!! AADDDDDDDDDD THIS TO MENU BROOO
	    menu();
	}
	if (input.equals("instructions")){
	    instruct();
	}
	if (input.equals("start")){
	    String inp = c.readLine("Would you like to have a 1 minute time cap on each move?");
	    if (inp.equals("Yes") || inp.equals("yes")){
		Chessboard.main(new String[0]);
	    }else{
		Chessboard2.main(new String[0]);
	    }
	}
	if (input.equals("quit")){
	    System.exit(0);
	}
    }



  public static void main(String[] args){
    System.out.print(ANSI_CLS);
    System.out.flush();
    Scanner input = new Scanner(System.in);
    String comInp = "";
    initialSplash();
    menu();
    System.out.print(">>> ");
    comInp = input.next();
    while (!comInp.equals("quit")){
	followCmd(comInp);
	System.out.print(">>> ");
	comInp = input.next();
    }
  }

}
