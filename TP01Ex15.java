import java.util.Scanner;

public class TP01Ex15 {

    public static void main(String args[]){
        
	 /* 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
        dólares. Calcular e exibir o valor correspondente em Reais (R$).
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double dolar, qtdDolar, real;

        System.out.println("Cotação do dólar: ");
        dolar = scan.nextDouble();
        
        System.out.println("Valor em dólar que deseja converter para reais: ");
        qtdDolar = scan.nextDouble();
        
        real=dolar*qtdDolar;
        
        System.out.println("Valor em real: " + real);

	}
}