import java.util.Scanner;

public class TP01Ex17 {

    public static void main(String args[]){
        
	 /* 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
        cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double x, y, xy;

        System.out.println("Valor de x: ");
        x = scan.nextDouble();

        System.out.println("Valor y: ");
        y = scan.nextDouble();

        xy = Math.pow(x, y);

        System.out.println("X elevado a Y: " + xy);

	}
}