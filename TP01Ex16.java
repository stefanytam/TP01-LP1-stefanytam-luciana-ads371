import java.util.Scanner;

public class TP01Ex16 {

    public static void main(String args[]){

         /* 16. Entrar via teclado com o valor de um �ngulo em graus, calcular e exibir as
        seguintes fun��es trigonom�tricas: seno, cosseno, tangente e secante deste �ngulo.
        Lembre-se que uma fun��o trigonom�trica trabalha em radianos. 
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double grau, rad;
        System.out.println("Digite o valor do �ngulo: ");
        grau = scan.nextDouble();
        
        rad = grau* 0.0175;
        
        System.out.println("Cosseno: " + Math.cos(rad));
        System.out.println("Cosseno: " + Math.sin(rad));
        System.out.println("Cosseno: " + Math.tan(rad));
      
    
	}
}