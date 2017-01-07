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
    try{
      Thread.sleep(1000);
      System.out.println();
      System.out.println();
      System.out.println(ANSI_CYAN +"          type   :"+ ANSI_WHITE + "instructions          "+ ANSI_GREEN +"for instructions");
      System.out.println(ANSI_CYAN +"          type   :"+ ANSI_WHITE +"start                 "+ ANSI_GREEN +"to start game");
      System.out.println(ANSI_CYAN +"          type   :"+ ANSI_WHITE +"quit                  "+ ANSI_GREEN +"to quit at anytime"+ ANSI_RESET);
    } catch(InterruptedException e){
      System.out.println("INTERRUPTED");
    }
  }



  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    while (!input.equals("quit")){
      initialSplash();

      // try{
      //   Thread.sleep(3000);
      //   System.out.flush();
      // } catch(InterruptedException e){
      //   System.out.println("INTERRUPTED");
      // }
      break;
    }
  }

}
