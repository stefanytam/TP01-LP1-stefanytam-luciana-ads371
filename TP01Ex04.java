import java.util.Scanner;

public class TP01Ex04 {

    public static void main(String args[]){

    	 /* 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite a base de um triângulo: ");
        double base = scan.nextDouble();
        System.out.println("Digite a altura de um triângulo: ");
        double altura = scan.nextDouble();
        double area = (base * altura)/2;
        System.out.println("Área: " + area);    
      
    
	}
}