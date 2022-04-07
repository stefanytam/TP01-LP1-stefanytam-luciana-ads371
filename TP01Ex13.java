import java.util.Scanner;

public class TP01Ex13 {

    public static void main(String args[]){
        
	 /* 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
        valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
        (em s) que serão digitados.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double vi, a, tempo, vfinalM, vfinalKM;

        System.out.println("Velocidade inicial (em m/s): ");
        vi = scan.nextDouble();
        System.out.println("Aceleração (m/s2): ");
        a = scan.nextDouble();
        System.out.println("Tempo (s): ");
        tempo = scan.nextDouble();
        vfinalM = vi + a*tempo;
        vfinalKM = vfinalM * 3.6;
        System.out.println("Velocidade final (em km/h): " + vfinalKM);

	}
}