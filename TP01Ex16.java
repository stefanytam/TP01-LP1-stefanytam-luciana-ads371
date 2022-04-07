import java.util.Scanner;

public class TP01Ex16 {

    public static void main(String args[]){

         /* 16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
        seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
        Lembre-se que uma função trigonométrica trabalha em radianos. 
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double grau, rad;
        System.out.println("Digite o valor do ângulo: ");
        grau = scan.nextDouble();
        
        rad = grau* 0.0175;
        
        System.out.println("Cosseno: " + Math.cos(rad));
        System.out.println("Cosseno: " + Math.sin(rad));
        System.out.println("Cosseno: " + Math.tan(rad));
      
    
	}
}