import java.util.Scanner;

public class TP01Ex11 {

    public static void main(String args[]){
        
	/* 11. A partir do di�metro de um c�rculo que ser� digitado, calcular e exibir sua �rea.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
        */
        Scanner scan = new Scanner(System.in);
        double area, raio, diametro;
        System.out.println("Valor do di�metro: ");
        diametro = scan.nextDouble();
        raio = diametro / 2;
        area = Math.PI * Math.pow(raio,2);
        System.out.println("�rea: " + area);

	}
}