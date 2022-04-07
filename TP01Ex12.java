import java.util.Scanner;

public class TP01Ex12 {

    public static void main(String args[]){

        /* 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
        base que serão digitados.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double altura, raio, volume;

        System.out.println("Altura: ");
        altura = scan.nextDouble();
        
        System.out.println("Raio da base: ");
        raio = scan.nextDouble();

        volume=(Math.PI*Math.pow(raio,2)*altura)/3;

        System.out.println("Volume: "+ volume);
    
	}
}