import java.util.Scanner;

public class TP01Ex04 {

    public static void main(String args[]){

    	 /* 4. A partir dos valores da base e altura de um tri�ngulo, calcular e exibir sua �rea.
        Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite a base de um tri�ngulo: ");
        double base = scan.nextDouble();
        System.out.println("Digite a altura de um tri�ngulo: ");
        double altura = scan.nextDouble();
        double area = (base * altura)/2;
        System.out.println("�rea: " + area);    
      
    
	}
}