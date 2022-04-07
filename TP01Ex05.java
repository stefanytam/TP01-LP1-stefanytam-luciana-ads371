import java.util.Scanner;

public class TP01Ex05 {

    public static void main(String args[]){
        
	/* 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite o diâmetro de um esfera: ");
        double diametro = scan.nextDouble();
        double raio = diametro /2;
        double volume = (4 *Math.PI * Math.pow(raio,3))/3;
        System.out.println("Volume: " + volume);

	}
}