import java.util.Scanner;

public class TP01Ex06 {

    public static void main(String args[]){

    	/* 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
        */
        Scanner scan= new Scanner(System.in);
        double media, x, y, z, k;
        System.out.println("Valor de x: ");
        x= scan.nextDouble();
        System.out.println("Valor de y: ");
        y= scan.nextDouble();
        System.out.println("Valor de z: ");
        z = scan.nextDouble();
        System.out.println("Valor de k: ");
        k = scan.nextDouble();
        media = (x+y+z+k)/4;
        System.out.println("Média: " + media);
      
    
	}
}