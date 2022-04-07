import java.util.Scanner;

public class TP01Ex03 {

    public static void main(String args[]){
        
	/* 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite a diagonal de um quadrado: ");
        double diagonal = scan.nextDouble();
        double area = Math.pow(diagonal,2)/2;
        System.out.println("Área: " + area);

	}
}