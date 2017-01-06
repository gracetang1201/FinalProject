import java.util.Scanner;
public class StartScreen{
    private String chess1 = "      ___           ___           ___           ___           ___     ";
    private String chess2 = "     /  /\\        /__/\\        /  /\\        /  /\\        /  /\\   ";
    private String chess3 = "    /  /:/         \\ \\:\\     /  /:/_       /  /:/_       /  /:/_   ";
    private String chess4 = "   /  /:/           \\__\\:\\  /  /:/ /\\    /  /:/ /\\    /  /:/ /\\ ";
    private String chess5 = "  /  /:/  ___   ___ /  /::\\  /  /:/ /:/_   /  /:/ /::\\  /  /:/ /::\\";
    private String chess6 = " /__/:/  /  /\\/__/\\ /:/\\:\\/__/:/ /:/ /\\/__/:/ /:/:\ /__/:/ /:/\:\ ";
    private String chess7 = " \  \:\ /  /:/ \  \:\/:/__\/ \  \:\/:/ /:/ \  \:\/:/~/:/ \  \:\/:/~/:/" ;
    private String chess8 = "  \  \:\  /:/   \  \::/       \  \::/ /:/   \  \::/ /:/   \  \::/ /:/ ";
    private String chess9 = "   \  \:\/:/     \  \:\        \  \:\/:/     \__\/ /:/     \__\/ /:/  ";
    private String chess10= "    \__\/         \__\/         \__\/         \__\/         \__\/     ";

    public static void main(String[] args){
	String newLine = System.getProperty("line.separator");
	System.out.println(chess1+newLine+chess2+newLine+chess3+newLine+chess4+newLine+chess5+newLine+chess6+newLine+chess7+newLine+chess8+newLine+chess9+newLine+chess10+newLine);
    }
}
