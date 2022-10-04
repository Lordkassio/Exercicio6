package ListaDeExerciciosPraPraticar;
import java.util.Scanner;

public class ListaDeExercicio6 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		 double raio;
	     double area;
	     final double PI = 3.1416;
	     
	     System.out.println("Escreva o valor do raio");
	     raio = entrada.nextFloat();
	   	     
	     area  = 2 * PI * raio;
	     
	     System.out.print("O valor da area é " + area);  
	     	     
	     entrada.close();
	     
	}

}
