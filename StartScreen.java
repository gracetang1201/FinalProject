import java.util.Scanner;
public class StartScreen{
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
      System.out.println("                         -- Rook No Further --");
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
      System.out.println("          type   :instructions          for instructions");
      System.out.println("          type   :start                 to start game");
      System.out.println("          type   :quit                  to quit at anytime");
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
