import java.util.Scanner;

public class TP01Ex15 {

    public static void main(String args[]){
        
	 /* 15. Entrar via teclado com o valor da cota��o do d�lar e uma certa quantidade de
        d�lares. Calcular e exibir o valor correspondente em Reais (R$).
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double dolar, qtdDolar, real;

        System.out.println("Cota��o do d�lar: ");
        dolar = scan.nextDouble();
        
        System.out.println("Valor em d�lar que deseja converter para reais: ");
        qtdDolar = scan.nextDouble();
        
        real=dolar*qtdDolar;
        
        System.out.println("Valor em real: " + real);

	}
}