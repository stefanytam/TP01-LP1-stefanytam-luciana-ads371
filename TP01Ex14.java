import java.util.Scanner;

public class TP01Ex14 {

    public static void main(String args[]){

        /* 14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
        “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
        digitados.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double raio, vEsfera, vLivre, vCubo, a;
        System.out.println("Digite o raio de um esfera: ");
        raio = scan.nextDouble();
        System.out.println("Digite a aresta de um cubo: ");
        a = scan.nextDouble();
        vEsfera = (4 * Math.PI * Math.pow(raio, 3)) / 3;
        vCubo = Math.pow(a, 3);
        vLivre = vCubo - vEsfera;
        System.out.println("Volume Livre: " + vLivre);
    
	}
}