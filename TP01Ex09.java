import java.util.Scanner;

public class TP01Ex09 {

    public static void main(String args[]){
        
	 /* 9. Calcular e exibir a tens�o de um determinado circuito eletr�nico a partir dos
        valores da resist�ncia e corrente el�trica que ser�o digitados. Utilize a lei de Ohm.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
        */
        Scanner scan= new Scanner(System.in);
        double tensao, resistencia, corrente;
        System.out.println("Valor da resist�ncia: ");
        resistencia = scan.nextDouble();
        System.out.println("Valor da corrente: ");
        corrente= scan.nextDouble();
        tensao = resistencia*corrente;
        System.out.println("Tens�o: " + tensao);

	}
}