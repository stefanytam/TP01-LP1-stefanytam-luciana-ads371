import java.util.Scanner;

public class TP01Ex18 {

    public static void main(String args[]){

         /* 18. Entrar via teclado com o valor de cinco produtos.
            Após as entradas, digitar um valor referente ao
            pagamento da somatória destes valores. Calcular e
            exibir o troco que deverá ser devolvido.
            Nomes: Luciana da Silva Costa, Stefany Tam Pereira Mendes
         */
        Scanner scan = new Scanner(System.in);
        double p1, p2, p3, p4, p5, s, t, paga;
        
        System.out.println("Digite o valor do 1º produto: ");
        p1 = scan.nextDouble();
        
        System.out.println("Digite o valor do 2º produto: ");
        p2 = scan.nextDouble();
        
        System.out.println("Digite o valor do 3º produto: ");
        p3 = scan.nextDouble();
        
        System.out.println("Digite o valor do 4º produto: ");
        p4 = scan.nextDouble();
        
        System.out.println("Digite o valor do 5º produto: ");
        p5 = scan.nextDouble();
        
        System.out.println("Digite o valor do pagamento: ");
        paga = scan.nextDouble();
        
        s = p1 + p2 + p3 + p4 + p5;
        t = paga - s;
        
        System.out.println("Troco: " + t);

    
	}
}