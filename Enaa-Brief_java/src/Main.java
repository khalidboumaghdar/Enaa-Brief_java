import java.util.Scanner;
import java.lang.Math;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	   static double additionn(double x, double y) {
       return x + y;
   }
    static double subtractionn(double x, double y) {
       return x - y;
   }
     static double multiplicationn(double x, double y) {
       return x * y;
   }


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
        do{


           double rs;


       menu();
        choix = scanner.nextInt();
       switch (choix){
           case 1:
               System.out.println("Enter la valeur de x: ");
               x = scanner.nextDouble();
               System.out.println("Enter la valeur de y: ");
               y = scanner.nextDouble();
                rs = additionn(x,y);
    System.out.println("la somme est : "+rs);
    break;
     case 2:
        System.out.println("Enter la valeur de x: ");
        x = scanner.nextDouble();
        System.out.println("Enter la valeur de y: ");
        y = scanner.nextDouble();
        rs = subtractionn(x,y);
        System.out.println("la subtractionn est : "+rs);
        break;
	   case 3:
            System.out.println("Enter la valeur de x: ");
            x = scanner.nextDouble();
            System.out.println("Enter la valeur de y: ");
            y = scanner.nextDouble();
            rs = multiplicationn(x,y);
            System.out.println("la multiplicationn est : "+rs);
            break;
 default:
                   System.out.println("invalid operation");






       }


       }while (choix!=3);



    }

}
