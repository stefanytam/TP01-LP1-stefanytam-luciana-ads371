import java.util.Scanner;

public class TP01Ex09 {

    public static void main(String args[]){
        
	 /* 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
        valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
        */
        Scanner scan= new Scanner(System.in);
        double tensao, resistencia, corrente;
        System.out.println("Valor da resistência: ");
        resistencia = scan.nextDouble();
        System.out.println("Valor da corrente: ");
        corrente= scan.nextDouble();
        tensao = resistencia*corrente;
        System.out.println("Tensão: " + tensao);

	}
}