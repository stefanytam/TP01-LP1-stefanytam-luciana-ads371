import java.util.Scanner;

public class TP01Ex08 {

    public static void main(String args[]){

        /* 8. Sabendo que uma milha mar�tima equivale a um mil, oitocentos e cinquenta e
        dois metros e que um quil�metro possui mil metros, fazer um programa para
        converter milhas mar�timas em quil�metros.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double milha, km;

        System.out.println("Dist�ncia em milha mar�tima: ");
        milha = scan.nextDouble();

        km = (milha * 1852) / 1000;

        System.out.println("Dist�ncia em km: "+ km);
      
    
	}
}