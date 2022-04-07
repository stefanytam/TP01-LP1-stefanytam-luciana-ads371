import java.util.Scanner;

public class TP01Ex08 {

    public static void main(String args[]){

        /* 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
        dois metros e que um quilômetro possui mil metros, fazer um programa para
        converter milhas marítimas em quilômetros.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double milha, km;

        System.out.println("Distância em milha marítima: ");
        milha = scan.nextDouble();

        km = (milha * 1852) / 1000;

        System.out.println("Distância em km: "+ km);
      
    
	}
}