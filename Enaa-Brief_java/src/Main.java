import java.util.Scanner;
import java.lang.Math;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	static void menu(){
       System.out.println("\n \t Welcome to the Calculator Program !!");
       System.out.println("1:Addition  ");
       System.out.println("2:Soustraction  ");
       System.out.println("3:Multiplication  ");
       System.out.println("4:Division  ");
       System.out.println("5:Puissance  ");
       System.out.println("6:Racine carrée  ");
       System.out.println("7:Factorielle");
       System.out.println("8:Au revoir !!");
       System.out.println("Veullez enter operation :");
   }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        int choix;
        menu();


    }

}
