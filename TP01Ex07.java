import java.util.Scanner;

public class TP01Ex07 {

    public static void main(String args[]){
        
	 /* 7. Calcular e exibir a m�dia geom�trica de dois valores quaisquer que ser�o digitados.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
        */
        Scanner scan= new Scanner(System.in);
        double media, x, y;
        System.out.println("Valor de x: ");
        x= scan.nextDouble();
        System.out.println("Valor de y: ");
        y= scan.nextDouble();
        media = Math.sqrt(x*y);
        System.out.println("M�dia: " + media);

	}
}