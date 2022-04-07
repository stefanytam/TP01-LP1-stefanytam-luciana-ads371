import java.util.Scanner;

public class TP01Ex10 {

    public static void main(String args[]){

         /* 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
        exibir sua temperatura equivalente em Fahrenheit.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double c, f;

        System.out.println("Temperatura em celsius: ");
        c = scan.nextDouble();

        f = 1.8*c+32;

        System.out.println("Temperatura em fahrenheit: "+ f);
      
    
	}
}