import java.util.Scanner;

public class TP01Ex02 {

    public static void main(String args[]){

         /* 2. Calcular e exibir a �rea de um quadrado, a partir do valor de sua aresta que ser� digitado.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double l, area;

        System.out.println("Aresta: ");
        l = scan.nextDouble();

        area = Math.pow(l,2);

        System.out.println("�rea: " + area);
    
	}
}