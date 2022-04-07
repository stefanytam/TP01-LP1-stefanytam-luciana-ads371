import java.util.Scanner;

public class TP01Ex01 {

    public static void main(String args[]){

     /**
     nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
     1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua area.
     */
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite a base de um retângulo: ");
        double base = scan.nextDouble();
        System.out.println("Digite a altura de um retângulo: ");
        double altura = scan.nextDouble();
        double area = base*altura;
        System.out.println("Área: " + area);    
    
	}
}